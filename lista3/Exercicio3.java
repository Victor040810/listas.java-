
package lista3;


public class Exercicio3 {


     public static void main(String[] args) {
         System.out.println(" caulcule ");
		int v = 1;
		int i = 1;
		int soma = 0;
		do {
                    
	System.out.println(i + "/" + v);
			soma = soma + (i/v);
			v++;
			i = i + 2;
		} while (v <= 50);
	System.out.println(" A soma é : "+soma);
	}

}
    
  