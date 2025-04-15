import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner leitor = new Scanner(System.in);
        int N = 0;
        int alcool=0;
        int gasolina =0;
        int diesel=0;

        while(N != 4){

            N = leitor.nextInt();

           while( N < 1 || N >4 ){
                N = leitor.nextInt();
           }
            switch (N) {
                case 1:  alcool++; break;
                case 2:  gasolina++; break;
                case 3:  diesel++; break;
            }
        }
        
            System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool:"+ alcool);
			System.out.println("Gasolina: "+ gasolina);
            System.out.println("Diesel: "+ diesel);
    }
 
}
