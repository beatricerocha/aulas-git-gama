package exercicios;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double salario, emprestimo, limite;

    System.out.println("Digite seu salário: ");
    salario = entrada.nextDouble();

    System.out.println("Digite seu emprestimo: ");
    emprestimo = entrada.nextDouble();
    // if (emprestimo <= (salario * 0.3)) {
    limite = (salario * 0.3);
    if (emprestimo <= limite) {
      System.out.println("emprestimo concedido com SUCESSO!");
    } else {
      System.out.println("emprestimo NEGADO!");
    }
    entrada.close();
  }
}