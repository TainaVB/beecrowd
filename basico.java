import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        int A;
        int B;
        int X;
        
       Scanner leitor = new Scanner(System.in);
       A = leitor.nextInt();
       B = leitor.nextInt();
       
       X = A + B;
       System.out.println("X = " + X);
       leitor.close();
 
    }
 
}
