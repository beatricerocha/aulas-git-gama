package exemplos;

import java.util.Scanner;

public class Exemplo03 {
  public static void main(String[] args) {
    // cria o scanner
    Scanner entrada = new Scanner(System.in);
    int idade;

    System.out.println("Digite sua idade: ");
    idade = entrada.nextInt();// recebe o valor

    System.out.println("Você tem: " + idade + " anos");// concatenação
    entrada.close();
  }
}
