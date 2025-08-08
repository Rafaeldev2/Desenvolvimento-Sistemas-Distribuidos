package Exemplo2;

import EstudoThreads.Exemplo2.Print;

public class ThreadMain {

    public static void main(String[] args) {
        Print print = new Print();
        Thread t1 = new Thread(new Thread1(print, 10), "T1");
        Thread t2 = new Thread(new Thread2(print, 12), "T2");
        System.out.println("Inicializando Threads");
        t1.start();
        t2.start();
    }
}