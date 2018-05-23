
package lista1exercicio3;

import java.util.Scanner;


public class Lista1Exercicio3 {

  
    
    public static void main(String[] args) {
       Scanner result = new Scanner(System.in);
        System.out.println(" Apresente o valor da lata de óleo ");
        float A_lata,R_lata,v_lata;
        A_lata = result.nextFloat();
        R_lata= result.nextFloat();
        v_lata = (float) (Math.PI*A_lata*R_lata);
        System.out.printf(" O volume da lata é : %.2f ",v_lata);
        
        
      
      
              
    }
     
}
