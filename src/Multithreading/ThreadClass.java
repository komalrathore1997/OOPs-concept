package Multithreading;

public class ThreadClass extends Thread{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("I am a executed by the child Thread");
            System.out.println("I am daemon thead or not :"+Thread.currentThread().isDaemon());
        }
    }
}
