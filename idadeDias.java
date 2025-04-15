import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int idadeEmDias;
       
       int meses, anos, dias;
       
       Scanner leitor = new Scanner(System.in);
       
       idadeEmDias = leitor.nextInt();
       
       int restoAno = idadeEmDias%365;
       anos = idadeEmDias/365;
       meses = restoAno/30;
       dias = restoAno % 30;
       
       System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
       leitor.close();
       
    }
 
}
