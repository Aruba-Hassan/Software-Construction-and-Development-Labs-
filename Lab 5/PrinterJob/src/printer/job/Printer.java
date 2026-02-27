package printer.job;
public class Printer {
    private int available_pages = 10;
    public synchronized void printPage(int print_pages) {
        System.out.println("Printer requested for " + print_pages + " pages.");
        while (available_pages < print_pages) {
            System.out.println("Not enough pages (" + available_pages + " available). Wait for adding pages.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available_pages -= print_pages;
        System.out.println("Printing " + print_pages + " pages. \nRemaining pages: " + available_pages);
    }
    public synchronized void addPages(int pages) {
        System.out.println("Adding " + pages + " pages.");
        available_pages += pages;
        System.out.println("Pages after addition: " + available_pages);
        notifyAll();
    }
}
class Print extends Thread {
    private Printer printer;
    private int pages;
    public Print(Printer printer, int pages) {
        this.printer = printer;
        this.pages = pages;
    }
    public void run() {
        printer.printPage(pages);
    }
}
class PageAdd extends Thread {
    private Printer printer;
    private int add_amount;
    public PageAdd(Printer printer, int add_amount) {
        this.printer = printer;
        this.add_amount = add_amount;
    }
    public void run() {
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printer.addPages(add_amount);
    }
}
class PrinterJob {
    public static void main(String[] args) {
        Printer p = new Printer();
        Print prints = new Print(p, 15);  
        PageAdd add_pages = new PageAdd(p, 10); 
        prints.start();
        add_pages.start();
    }
}
