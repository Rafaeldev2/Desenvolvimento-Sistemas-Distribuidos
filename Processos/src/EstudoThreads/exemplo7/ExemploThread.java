package exemplo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class ExemploThread {

    public static List<Double> lista = Collections.synchronizedList(new ArrayList<Double>());

    public static void main(String[] args) {
        try {
            Runnable r4 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Calculando resultado final");
                    double soma = 0;
                    for (double valor : lista) {
                        soma += valor;
                    }
                    System.out.println("O resultado é " + soma);
                }
            };

            CyclicBarrier barrier = new CyclicBarrier(3, r4);
            ExecutorService executor = Executors.newFixedThreadPool(3);

            Runnable r1 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Iniciando R1");
                    double result = 300d*7.5d;
                    lista.add(result);
                    System.out.println("Finalizando R1");
                    try {
                        barrier.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

            Runnable r2 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Iniciando R2");
                    double result = Math.pow(20,4);
                    lista.add(result);
                    System.out.println("Finalizando R2");
                    try {
                        barrier.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

            Runnable r3 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Iniciando R3");
                    double result = 805d/6.33d;
                    lista.add(result);
                    System.out.println("Finalizando R3");
                    try {
                        barrier.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

            executor.execute(r1);
            executor.execute(r2);
            executor.execute(r3);
            Thread.sleep(1000);
            executor.execute(r1);
            executor.execute(r2);
            executor.execute(r3);
            executor.awaitTermination(10, TimeUnit.SECONDS);
            executor.shutdown();
            System.out.println("Finalizando execução");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
