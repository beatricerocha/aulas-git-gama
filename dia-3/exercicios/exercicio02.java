package exercicios;

import java.util.Scanner;

public class exercicio02 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    double nota1, nota2, media;
    // entrada
    System.out.println("Digite 1° nota: ");
    nota1 = entrada.nextDouble();
    System.out.println("Digite 2° nota: ");
    nota2 = entrada.nextDouble();
    // processamento
    media = (nota1 + nota2) / 2;
    System.out.println("Sua média é igual a: " + media);
    // saida
    entrada.close();
  }
}
