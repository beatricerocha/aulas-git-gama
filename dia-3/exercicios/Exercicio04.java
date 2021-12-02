package exercicios;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double salarioMin, quilowatt, gasto;

    System.out.println("Digite o valor salário: ");
    salarioMin = entrada.nextDouble();

    quilowatt = (salarioMin / 500);

    gasto = 15 * quilowatt;
    System.out.println("valor quilowatt: " + quilowatt);
    System.out.println("valor pagar: " + gasto);
    System.out.println("valor a pagar com desconto de 15%: " + (gasto - (gasto * 0.15)));
    entrada.close();
  }
}
