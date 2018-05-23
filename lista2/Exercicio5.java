package lista2;

import java.util.Scanner;


public class Exercicio5 {
    
    public static void main(String[] args) {
        int escolha;
        Scanner result = new Scanner(System.in);
    System.out.println(" Digite [1] para Soma");
    System.out.println(" Digite [2]  ver o produto");
    System.out.println(" Digite [3] para saber média");
        escolha = result.nextInt();
        int n1, n2, n3;
    System.out.println("Informe 3 números:"); 
        n1 = result.nextInt();
        n2 = result.nextInt();
        n3 = result.nextInt();
        int soma = n1 + n2 + n3;
        float media = (n1 + n2 + n3) / 3;
        switch (escolha) {
            case 1:
    System.out.println("A soma é :" + soma);
                break;
            case 2:
    System.out.println("O produto é :" + n1 * n2 * n3);
                break;
            case 3:
    System.out.println("A média é :" + media);
                break;
                
                
        }

    }

}

