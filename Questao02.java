import java.util.Scanner;

public class Questao02 {
  public static void main(String[] args) {
    System.out.println("Digite a Senha: ");
    String n;
    Scanner input = new Scanner(System.in);
    n = input.nextLine();
    int x = n.length();
    if(x<6){
      int y = 6-x;
      System.out.println(y);
    }
  }
}