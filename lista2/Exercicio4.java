
package lista2;
import java.util.Scanner;


public class Exercicio4 {
     
 public static void main(String[] args) {
     Scanner result = new Scanner(System.in);
     System.out.println("Informe 3 números :");
        int n1 = result.nextInt();
        int n2 = result.nextInt();
        int n3 = result.nextInt();
     System.out.println(" Escreva as letras \n[C] para crescente !! \n[D] para decrescente !!");
         String Nescolha = result.next();
         
      if (Nescolha.equals("C")) {
       
       if((n1>=n2) && (n2>=n3)){
           System.out.printf(" A ordem crescente dos número digitados \n" + n3 +","+ n2 +"," + n1 );
       }
       
       if((n1>=n3) && (n3>=n2)){
           System.out.println("A ordem crescente dos número citados é \n" + n2 + "," + n3 +","+ n1 );
        }
       
       if((n2>=n3) && (n3>=n1 )){
           System.out.println("A ordem crescente dos número citados é \n" + n1 + ","+ n3 +","+  n2 );
       }
       
       if ((n2>=n1) && (n1>=n3)) {
           System.out.println("A ordem crescente dos número citados é \n" + n3 +"," + n1 + "," + n2 );
       }
       
      if ((n3>=n1) && (n1>=n2)){
          System.out.println("A ordem crescente dos número citados é \n" + n2 + ","+ n1 + "," + n3 );
      }
      
      if ((n3>=n2) && (n2>=n1)){
          System.out.println("A ordem crescente dos número citados é \n " + n1 + "," + n2  +","+  n3 );
     }
       }  
       
      else if (Nescolha.equals("D")){
         
   
       if ((n1<=n2) && (n2<=n3)){
         System.out.println("a ordem decrescente dos número citados é " + n3 +"," + n2 +","+ "," + n1 );
     }
        if ((n2<=n1) && (n1<=n3)){
           System.out.println("a ordem decrescente dos números citados é "+ n3 +"," + n1+ "," +n2);
       }
        if((n1<=n3) && (n3<=n2)){
            System.out.println("a ordem decrescente dos números citados é "+ n2 +","+ n3 +"," + n1);
        }
        if ((n2<=n3) && (n3<=n1)){
        System.out.println("a ordem decrescente dos números citados é "+ n1 +","+  n3+ "," + n2);
                }   
        if((n3<=n1) && (n1<=n2)){
            System.out.println("a ordem decrescente dos números citados é "+ n2 +","+ n1+ "," + n3);
        }
        if ((n3<=n2) && ( n2<=n1)){
            System.out.println("a ordem decrescente dos números citados é "+ n1 +","+  n2 +","+ n3);
        }         
    }
}
}    