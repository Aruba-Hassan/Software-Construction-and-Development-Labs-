package table;
public class Table extends Thread{
	int num;
	String name;
	public Table(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public void run() {
		System.out.println("Table of " + num + " : ");
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i) + " -- " +  name);
			try {
				Thread.sleep(300);	
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		Table roll_no = new Table(367,"Roll No");
		Table date_birth = new Table (13,"Date of Birth");
		roll_no.start();
		date_birth.start();
	}
}
