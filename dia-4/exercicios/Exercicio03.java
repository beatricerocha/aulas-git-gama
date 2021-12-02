package exercicios;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float n1, n2;

    System.out.println("Digite dois números: ");
    n1 = entrada.nextFloat();
    n2 = entrada.nextFloat();
    if (n1 < n2) {
      System.out.printf("O número é " + n1 + " menor que " + n2);
    } else {
      System.out.printf("O número é " + n2 + " maior que " + n1);
    }

    entrada.close();
  }
}
