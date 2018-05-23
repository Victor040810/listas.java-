
package lista2;
import java.util.Scanner;

public class Exercicio3 {

public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        double media;
        Scanner result = new Scanner(System.in);
   System.out.print("Informe a primeira nota:");
        n1 = result.nextInt();
        double maior = n1;
   System.out.print("Informe a segunda nota:");
        n2 = result.nextInt();
   System.out.print("Informe a terceira nota:");
        n3 = result.nextInt();
        if (maior < n2) {
            maior = n2;
        } else if (maior < n3) {
            maior = n3;
        }
        media = (n1 + n2 + n3) / 3;
   System.out.println("A maior entre todas é : " + maior);
   System.out.printf("A média é das notas é %.2f\n :" , media);      
    }
}
