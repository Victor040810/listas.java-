
package lista2;
import java.util.Scanner;


public class Exercicio2 {

        
 public static void main(String[] args) {
        
        Scanner result = new Scanner(System.in);
        System.out.println(" Informe o primeiro  lado do triângulo:");
        System.out.println(" Informe  o segundo  lado triângulo:");
        System.out.println(" Informe  o terceiro lado do triângulo:");
        
        int A = result.nextInt();
        int B = result.nextInt();
        int C = result.nextInt();

        if (A + B > C && B  + C > A && A + C > B) {
            System.out.println("Parabéns, é um triângulo.");
            if (A == B && B == C) {
                System.out.println("É um triângulo equilátero.");
            } else if (A == B && B != C) {
                System.out.println("É um triângulo Isóceles.");
            } else if (A != B && B!= C) {
                System.out.println("É um triângulo Escaleno.");
            }
        } else {
            System.out.println(" Não é um triângulo,tente novamente :).");
        }
    
    }
}
    
    

