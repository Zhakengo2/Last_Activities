spackage Task5;

public class Task13_2 {
    private static Object object1 = new Object();
    private static Object object2 = new Object();
    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo2 t2 = new ThreadDemo2();
        t1.start();
        t2.start();
    }
    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (object1) {
                System.out.println("waiting...");

                synchronized (object2) {
                    System.out.println("complete");
                }
            }
        }
    }
    private static class ThreadDemo2 extends Thread {
        public void run() {
                synchronized (object2) {
                    System.out.println("waiting...");

                synchronized (object1) {
                    System.out.println("Complete ");
                }
            }
        }
    }
}