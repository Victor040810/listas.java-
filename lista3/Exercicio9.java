package lista3;

 import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        
    
    Scanner result = new Scanner (System.in);
    
          int p;
          int cont = 0;

          System.out.println(" Informe um número: ");
          p = result.nextInt();
             for(int v = 1; v <= p;  v ++){
             if (p % v == 0){
                cont++;
            }
          }
              if(cont == 2)  {
        System.out.println(" Este número "+ p +" é primo!");
        } else {
        System.out.println(" Este número "+ p +" não é primo.");
        
         }
       
    }
     
}
