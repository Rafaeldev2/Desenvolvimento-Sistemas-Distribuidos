package Exemplo2;

import EstudoThreads.Exemplo2.Print;

public class Thread2 {

    private Print print;
    private int numero;

    public Thread2(Print print, int numero) {
        this.print = print;
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("Inicializando a execução da Thread: " + Thread.currentThread().getName());
        print.print(numero);
        System.out.println("Finalizando a execução da Thread: " + Thread.currentThread().getName());
    }
}
