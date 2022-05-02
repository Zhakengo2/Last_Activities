package Task5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task13{
    static int sum = 0;
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        AddNum num = new AddNum();
        for (int i = 0; i < 1000; i++) {
            service.execute(num);
        }
        service.shutdown();

        while (!service.isTerminated()) {
        }

        System.out.println(sum);


    }
    private static class AddNum implements Runnable{
        @Override
        public synchronized void run() {
            sum++;
        }

    }
}
//(Synchronize threads) Write a program that launches 1,000 threads. Each thread adds 1 to a variable
// sum that initially is 0. Define an Integer wrapper object to hold sum. Run the program with and without
// synchronization to see its effect.
