
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            Process process = new ProcessBuilder("java", "-version").start();
            BufferedReader resultado1 = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader resultado2 = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            System.out.println(resultado1.readLine());
            System.out.println(resultado2.readLine());
        } catch (IOException e) {
            System.err.println("Erro ao iniciar comando");
            e.printStackTrace();
        }
    }
}