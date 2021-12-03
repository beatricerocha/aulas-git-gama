package exercicio;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int valorDigitado, cont, soma;
    valorDigitado = 1;
    cont = 1;
    soma = 0;

    while (valorDigitado != 0) {
      System.out.printf("Digite %d° número: ", cont);
      valorDigitado = entrada.nextInt();
      cont++;
      soma = soma + valorDigitado;
    }
    System.out.println("Soma = " + soma);

    entrada.close();
  }
}
