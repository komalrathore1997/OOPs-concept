package Multithreading;
public class MainClass {
    public static void main(String[] args) {
        ThreadClass obj=new ThreadClass();
        obj.setDaemon(true);

        obj.start();

        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);

//        thread.start();

        for(int i=0;i<1000;i++){
            System.out.println("I am execution the Main Thread");
            System.out.println("I am a Daemon Thread or not "+Thread.currentThread().isDaemon());
        }
    }
}
