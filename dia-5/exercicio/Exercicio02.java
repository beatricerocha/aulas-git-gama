package exercicio;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int valorDigitado, cont, resultado;
    System.out.println("Digite um numero: ");
    valorDigitado = entrada.nextInt();

    cont = 0;

    while (cont <= 10) {
      resultado = valorDigitado * cont;
      // System.out.println(valorDigitado + " x " + cont + " = " + resultado);
      System.out.printf("%d x %2d = %2d\n", valorDigitado, cont, resultado);
      cont++;
    }

    entrada.close();
  }
}
