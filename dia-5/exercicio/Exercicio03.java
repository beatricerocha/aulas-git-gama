package exercicio;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int valorDigitado, cont;
    System.out.println("Digite um numero: ");
    valorDigitado = entrada.nextInt();

    cont = 1;

    while (cont <= valorDigitado) {

      System.out.printf("%d ", cont);
      cont *= 2;// cont = cont * 2
    }

    entrada.close();
  }
}
