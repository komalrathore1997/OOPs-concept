package Multithreading;

public class ExtendThread extends Thread{

	
	public void run() {
		for(int i=0;i<100;i++) {	
			System.out.println("Komal Rathore");
		}
		
	}
	
	public static void main(String[] args) {
		ExtendThread thread=new ExtendThread();
		thread.start();
		
	}

}
