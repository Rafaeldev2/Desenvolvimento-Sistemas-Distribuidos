package threads.exemplo5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadMain {

    public static void main(String[] args) {
        try {
            System.out.println("Iniciando Threads");
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<?> future = executor.submit(new ThreadExemplo());
            System.out.println(future.isDone());
            while (!future.isDone()) {
                System.out.println("Executando thread");
            }
            executor.shutdown();
            System.out.println(future.isDone());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
