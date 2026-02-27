package open.ended;
class ATM {
    public void worker() {
        System.out.println("Worker is performing general duties.");
    }
}
class Cashier extends ATM implements Runnable {
    private Bank bank;
    public Cashier(Bank bank) {
        this.bank = bank;
    }
    public void run() {
        worker();  
        try {
            Thread.sleep(500);   
            bank.loadCash(100000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Bank {
    private int balance = 0;
    private boolean availableCash = false;

    public synchronized void loadCash(int amount) {
        while (availableCash) {
            try {
                wait();     
            } catch (Exception e) {}
        }
        balance += amount;
        System.out.println("ATM Loaded: " + amount);
        availableCash = true;
        notify();            
    }
    public synchronized void withdraw(int amount) {
        while (!availableCash) {
            try {
                wait();     
             } catch (Exception e) {}
        }

        System.out.println("Customer withdrawing: " + amount);
        balance -= amount;
        availableCash = false;
        notify();            
    }
}
class Customer implements Runnable {
    private Bank bank;
    public Customer(Bank bank) {
        this.bank = bank;
    }
    public void run() {
        try {
            Thread.sleep(300);   
            bank.withdraw(50000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class DeadlockATM {
    private final Object vault = new Object();
    private final Object receipt = new Object();
    public void createDeadlock() {
        Thread t1 = new Thread(() -> {
            synchronized (vault) {
                System.out.println("Worker 1 locked vault");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (receipt) {
                    System.out.println("Worker 1 locked receipt");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (receipt) {
                System.out.println("Worker 2 locked receipt");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (vault) {
                    System.out.println("Worker 2 locked vault");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
 class BankAccounts {
    public static void main(String[] args) {
        System.out.println("ATM SYSTEM SIMULATION.");
        Bank bank = new Bank();
        Thread cashier = new Thread(new Cashier(bank));
        Thread customer = new Thread(new Customer(bank));
        cashier.start();
        customer.start();
        System.out.println("DEMONSTRATING DEADLOCK.");
        DeadlockATM deadlock = new DeadlockATM();
        deadlock.createDeadlock();
    }
}
