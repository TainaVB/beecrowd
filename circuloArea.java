import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       double A;
       double pi = 3.14159;
       double R;
       
       Scanner leitor = new Scanner(System.in);
       R = leitor.nextDouble();
       A = pi * Math.pow(R, 2);
       System.out.printf("A=%.4f %n", A);
       
       leitor.close();
 
    }
 
}
