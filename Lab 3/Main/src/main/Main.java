package main;
public class Main extends Thread{
	public void run() {
		System.out.println("Task one");
	}
	public static void main(String[] args) {
		Main t1 = new Main();
		Main t2 = new Main();
		Main t3 = new Main();
		Main t4 = new Main();
		Main t5 = new Main();
		Main t6 = new Main();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
