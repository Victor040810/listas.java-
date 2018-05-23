package lista3;

import java.util.Scanner;

public class Exercicio6 {
     
  public static void main(String[] args){
    
            int opc = 0;
            while(opc ==0){
        Scanner result  = new Scanner(System.in);

        System.out.println(" Informe 3 números : ");
            float n1 = result.nextFloat();
             float n2 = result.nextFloat();
              float n3 = result.nextFloat();
               if((n3>n2)&&(n3>n1)&&(n2>n1)){
                float produto = n1*n2*n3;
                float soma = n1+n2+n3;
                float media = soma/3;
         System.out.println("PRODUTO: "+produto);      
         System.out.println("SOMA: "+soma);
         System.out.println("MEDIA: "+media);
                  }else{
         System.out.println(" ========= Telaaa azul ======== ");
                opc = 1;
            }
        }
    }
}
