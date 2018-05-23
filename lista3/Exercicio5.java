
package lista3;

import java.util.Scanner;

public class Exercicio5 {
    
        public static void main(String[] args) {
        Scanner result = new Scanner(System.in);

        int v = 0;
        int impar = 0;
        int par = 0;
      
        while (v <= 1000){
            v = result.nextInt();
            
            if(v %2 == 0){
                 par = par + v;
            }else{
                 impar = impar + v;
         
            }
        }
System.out.println("Soma dos Pares:"+ par +"  Soma dos Impares: "+ impar);
    }
  }
