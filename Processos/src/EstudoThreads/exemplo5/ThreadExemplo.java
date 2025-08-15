package threads.exemplo5;

import java.util.Random;

public class ThreadExemplo implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Iniciando a execução da Thread: " + Thread.currentThread().getName());
            Random random = new Random();
            int tempo = random.nextInt(1000, 5000);
            System.out.println("Tempo da thread: " + Thread.currentThread().getName() + " - " + tempo);
            Thread.sleep(tempo);
            System.out.println("Finalizada a execução da Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
