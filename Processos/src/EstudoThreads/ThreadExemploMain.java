package EstudoThreads;

public class ThreadExemploMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new threadsTest(), "T1");
        Thread t2 = new Thread(new threadsTest(), "T2");
        System.out.println("Inicializando Thread");
        t1.start();
        t2.start();
        System.out.println("Threads Inicializadas");
        System.out.println("Threads Finalizadas");
    }
}