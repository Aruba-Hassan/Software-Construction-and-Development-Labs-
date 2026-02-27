package bank.account;
public class Accounts {
	private int balance = 50000;
	public synchronized void withdraw(String user, int amount) {
		if(balance < amount) {
			System.out.println("Insufficient balance for " + user + ". Available: " + balance);
		}else {
			System.out.println(user + " is withdraw.");
			balance -= amount;
			System.out.println(user + " completed withdraw. Remaining balance: " + balance);
		}
	}
	public int getBalance() {
		return balance;
	}
}
class UserThread extends Thread{
	private Accounts account;
	private String user;
	private int amount;
	public UserThread(Accounts account, String user, int amount) {
		this.account = account;
		this.user = user;
		this.amount = amount;
	}
	public void run() {
		account.withdraw(user, amount);
	}
}
class Bank{
	public static void main(String[] args) {
		Accounts account = new Accounts();
		UserThread acc_holder1 = new UserThread(account, "Aruba" , 45000);
		UserThread acc_holder2 = new UserThread(account, "Hassan" , 20000);
		acc_holder1.start();
		acc_holder2.start();
	}
}
