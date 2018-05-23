package lista3;

import java.util.Scanner;
public class Exercicio8 {

    public static void main(String[] args){
        
          int num;
          int v = 0;
          int i = 0;
        
        Scanner result = new Scanner(System.in);
       
    System.out.println(" Informe um numero: ");
        num = result.nextInt();
          v = v-num;
          i = i-num;
    System.out.println(" Os números pares, positivos e negativos de "+ num+  " são estes : ");
          while(v<num){
            v++;
            if(v %2 == 0){
    System.out.println(v);
            }
        }
    System.out.println(" Os números impares, positivos e negativos de "+ num+  " são estes : ");
        while(i<num){
            i++;
            if(i%2 != 0){
    System.out.println(i);
            }
        }
    }
}