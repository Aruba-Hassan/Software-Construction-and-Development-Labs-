package englishalphabet;
import java.util.*;
public class Alphabets extends Thread{
	private boolean run  = true;
	public void stopThread() {
		run = false;
	}
	public void run() {
		for(int i = 0; i<26 && run; i++) {
			int random_no = 65 + (int)(Math.random()*26);
			char letter = (char)random_no;
			System.out.println("Letter ::" + letter + " ");
			try {
				Thread.sleep((int)(Math.random()*400 + 100));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\nThread Finished.");
	}
	public static void main(String[] args) {
		Alphabets alphabet = new Alphabets();
		System.out.println("\nStarting Thread.");
		alphabet.start();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nStopping Thread.");
		alphabet.stopThread();
	}
}
