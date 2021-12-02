package exercicios;

import java.util.Scanner;

public class exercicio03 {
  public static void main(String[] args) {
    /*
     * Scanner entrada = new Scanner(System.in);
     * double salario;
     * 
     * System.out.println("Digite seu salário: ");
     * salario = entrada.nextDouble();
     * 
     * System.out.println("Seu salário + acrescimo de 25% é igual a: " + (salario +
     * (salario * 0.25)));
     * entrada.close();
     */
    Scanner entrada = new Scanner(System.in);
    double salario, novoSalario;

    System.out.println("Digite seu salário: ");
    salario = entrada.nextDouble();

    // p
    // novoSalario = salario + (salario *0.25);
    novoSalario = (salario * 1.25);
    // s
    System.out.println("Seu salário + acrescimo de 25% é igual a: " + novoSalario);
    entrada.close();
  }
}