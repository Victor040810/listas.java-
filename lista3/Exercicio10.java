
package lista3;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
  
    Scanner result = new Scanner(System.in);
    System.out.println(" Informe qualquer número: ");
        int num = result.nextInt();

        for (int v = 1; v <= num; v++) {
            int cont = 0;

            for (int i = 1; i <= num; i++) {
                if (v % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
    System.out.println(" Até chegar a :"+ num + " A ordem dos  primos é " + v);
            }
        }

    }
}