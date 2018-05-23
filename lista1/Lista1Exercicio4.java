
package lista1exercicio1;
import java.util.Scanner;


public class Lista1Exercicio4 {


    public static void main(String[] args) {
      Scanner result = new Scanner(System.in);
      int A,B, troca; 
        System.out.println("Informe 2 números");
          A = result.nextInt();
          B = result.nextInt();
          troca = A;
            A = B; 
             B = troca;        
        System.out.println(" A variavel A é : " + A);
        System.out.println(" A variavel B é :" + B);
    }
    
}
