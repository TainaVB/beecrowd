import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner leitor = new Scanner(System.in);
    int N = leitor.nextInt();
    int resto;
    
    for(int i =0; i<N; i++){
       int F1 = leitor.nextInt();
       int F2 = leitor.nextInt();
        
       while(F2 != 0){
           resto = F1 % F2;
           F1 = F2;
           F2 = resto;
       }
       System.out.println(F1);
    }
 
    }
 
}
