package EstudoThreads.Exemplo1;

public class ThreadExemploMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new threadsTest(), "T1");
        Thread t2 = new Thread(new threadsTest(), "T2");
        System.out.println("Inicializando Thread");
        t1.start();
        t2.start();
        System.out.println("Threads Inicializadas");
        try {
            t1.join();
            t2.join();   
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Threads Finalizadas");
    }
}