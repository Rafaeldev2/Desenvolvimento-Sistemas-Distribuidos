package EstudoThreads.Exemplo1;

import java.util.Random;

public class threadsTest implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Iniciando a execução da thread: " + Thread.currentThread().getName());
            Random random = new Random();
            Thread.sleep(random.nextInt(1000, 5000));
            System.out.println("Finalizada a excução da thread: " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}