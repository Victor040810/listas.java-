
package lista1exercicio1;

import java.util.Scanner;


public class Lista1Exercicio1 {

  
    public static void main(String[] args) {
        Scanner resultado  = new Scanner(System.in);
        double num1;
        double num2;
        double soma;
        double dif;
        double produto;
        double media;
        System.out.printf(" Digite 2 números: ");
        num1 = resultado.nextInt();
        num2 = resultado.nextInt();
        soma = num1 + num2;
        dif = num1 - num2;
        produto = num1*num2;
        media = num1 +num2/2;
        System.out.println(" Soma = " + soma );
        System.out.println(" diferença = " + dif);
        System.out.println(" produto = " + produto);
        System.out.println(" media =" + media);
    }
    
}