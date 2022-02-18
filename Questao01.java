/* # Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
  */

import java.util.Scanner;

public class Questao01 {
  
  public static void imprimeEspaco(int espaco){
    for(int i=espaco;i>0;i--){
      System.out.print(" ");
   } 
  }
  
  public static void imprimeEstrela(int estrelas){
    for (int j=estrelas;j>0;j--){
    System.out.print("*");
    }
  }
      
  public static void degrau(int d){
    int total = d; 
    while(d>0){
      int espa = d-1; 
      imprimeEspaco(espa);
      int estr = total - espa; 
      imprimeEstrela(estr);
      System.out.println("");
      d--;
      }
    }
    
  public static void main(String[] args) {
    int n;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o tamanho da escada: ");
    n = input.nextInt();
    degrau(n);    
  }
}