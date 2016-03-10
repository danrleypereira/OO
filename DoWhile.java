/*
  SÍNTESE
     Objetivo: calcular o peso de X pessoas usando a estrutura "do while"
     Entrada: pesos de cada pessoas e o flag como peso igual ou menor de zero.
     Saída: a media de pesos.
*/
import java.util.Scanner;
public class DoWhile {
   public static void main(String[] args) {
       //Declarações     
         Scanner leitor = new Scanner(System.in);
         float peso,acumulador=0,media;
         int contador=0;
       //Início
         System.out.println("Informe o "+(contador + 1)+" peso:");
         peso = leitor.nextFloat();
         do {
            acumulador=acumulador+peso;
            contador++;
            System.out.println("Informe o "+(contador+1)+" peso:");
            peso = leitor.nextFloat();   //lendo a nova nota
         }while(peso>0);
         media=acumulador/contador;
         System.out.println("Media = " + media);  //mostrando a média
         System.out.println("Quantidade = " + contador); //mostrando a quantidade.
        
   }
}
