
import java.util.Random;

public class ThreadExemplo implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Iniciando a execução da thread: " + Thread.currentThread().getName());
            Random random = new Random();
            int tempo = random.nextInt(1000, 5000);
            System.out.println("Tempo de excução da thread: " + Thread.currentThread().getName() + "-" + tempo);
            Thread.sleep(tempo);
            System.out.println("Finalizada a excução da thread: " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}