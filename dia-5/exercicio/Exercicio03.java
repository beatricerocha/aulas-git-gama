package exercicio;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int valorDigitado, cont;

    System.out.print("Digite um numero: ");
    valorDigitado = entrada.nextInt();

    cont = 1;

    while (cont <= valorDigitado) {
      int proximoNumero = cont * 2;
      if (proximoNumero <= valorDigitado) {// existirá outro num depois
        System.out.print(cont + ",");
      } else {
        System.out.print(cont);
      }
      cont *= 2;// cont = cont * 2
    }
    entrada.close();
  }
}
