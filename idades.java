import java.io.IOException;
import java.util.Scanner;

 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double soma = 0; 
        double idade = 0;
        while (idade >= 0) {
            idade = leitor.nextInt();
            if (idade >= 0) { 
                cont++;
                soma+=idade;
            }
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
 
    }
 
}
