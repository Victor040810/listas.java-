
package lista3;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
		Scanner result = new Scanner(System.in);
		float maior = 0;
		float menor = 999999999;
		for (int i = 0; i < 15; i++) {
			float num = result.nextFloat();
			if (num < menor) {
				menor = num;
			} else {
			if (num > maior){
				maior = num;
			} else {	
		} 
	System.out.println(" O Maior : "+ maior );
        System.out.println("O Menor :" + menor );
	    }
         }
      }
    }