package Multithreading;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Custom thread");
		}
	}
	
	public static void main(String[] args) {
		RunnableInterface obj=new RunnableInterface();
		Thread thread=new Thread(obj);
		thread.start();
		
	}

}
