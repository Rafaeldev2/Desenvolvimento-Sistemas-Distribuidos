package EstudoThreads.Exemplo2;

public class Print {
    public synchronized void print(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
