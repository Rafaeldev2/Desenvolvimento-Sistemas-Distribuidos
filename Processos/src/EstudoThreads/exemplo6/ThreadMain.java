package exemplo6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMain {

    public static void main(String[] args) {
        try {
            System.out.println("Iniciando a execução");
            ExecutorService executor = Executors.newCachedThreadPool();
            executor.execute(new ThreadExemplo());
            executor.execute(new ThreadExemplo());
            executor.execute(new ThreadExemplo());
            executor.execute(new ThreadExemplo());
            executor.execute(new ThreadExemplo());
            Thread.sleep(10000);
            executor.execute(new ThreadExemplo());
            executor.execute(new ThreadExemplo());
            executor.execute(new ThreadExemplo());
            executor.execute(new ThreadExemplo());
            executor.execute(new ThreadExemplo());
            executor.awaitTermination(15, TimeUnit.SECONDS);
            executor.shutdown();
            System.out.println("Finalizando execução");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
