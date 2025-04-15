import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
      int A, B, C;
      Scanner leitor = new Scanner(System.in);
      
      A = leitor.nextInt();
      B = leitor.nextInt();
      C = leitor.nextInt();
      
    int maior1 = (A + B + Math.abs(A - B)) / 2;
    int maior2 = (maior1 + C + Math.abs(maior1 - C)) / 2;
    
    System.out.println(maior2 + " eh o maior");
      
      leitor.close();
    }
 
}
