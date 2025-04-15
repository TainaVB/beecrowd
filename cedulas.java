import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N;
        Scanner leitor = new Scanner(System.in);
         
        N = leitor.nextInt();
        int notas = N;
        int cemNota = N/100;
        N = N%100;
        int cinqNota = N / 50;
        N = N%50;
        int vintNota = N / 20;
        N = N%20;
        int dezNota = N / 10;
        N = N%10;
        int cincoNota = N / 5;
        N = N%5;
        int doisNota = N / 2;
        N = N%2;
        int umNota = N / 1;
       
        System.out.println(notas);
        System.out.println(cemNota +" nota(s) de R$ 100,00");
        System.out.println(cinqNota +" nota(s) de R$ 50,00");
        System.out.println(vintNota +" nota(s) de R$ 20,00");
        System.out.println(dezNota +" nota(s) de R$ 10,00");
        System.out.println(cincoNota +" nota(s) de R$ 5,00");
        System.out.println(doisNota +" nota(s) de R$ 2,00");
        System.out.println(umNota +" nota(s) de R$ 1,00");
        leitor.close();
        
    }
 
}
