import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMain {
    public static void main(String[] args) {
        try {
        System.out.println("Inicializando a execução");

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new ThreadExemplo());
        executor.execute(new ThreadExemplo());
        executor.execute(new ThreadExemplo());
        executor.awaitTermination(15, TimeUnit.SECONDS);
        executor.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
