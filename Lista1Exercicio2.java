
package lista1exercicio2;


import java.util.Scanner;

public class Lista1Exercicio2 {

    
    public static void main(String[] args) {
    System.out.println(" Informe a temperatura em graus centígrados ");   
      Scanner result = new Scanner (System.in);
       float gc,gf;
          gc = result.nextFloat();
          gf = (9*gc+160)/5;
     System.out.printf("O valor %.2f em  graus celsius, é %.3f convertido em graus fahrrenheit\n" ,gc,gf);

    
  
     
       
    }
    
    
    
}



