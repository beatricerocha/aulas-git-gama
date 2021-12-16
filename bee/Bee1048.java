import java.util.Scanner;

public class Bee1048 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double salario;
    int percentual;
    salario = entrada.nextDouble();
    if (salario >= 0.00 && salario <= 400.00) {
      percentual = 15;
      calculation_and_print(salario, percentual);
    } else if (salario >= 400.01 && salario <= 800.00) {
      percentual = 12;
      calculation_and_print(salario, percentual);
    } else if (salario >= 800.01 && salario <= 1200.00) {
      percentual = 10;
      calculation_and_print(salario, percentual);
    } else if (salario >= 1200.01 && salario <= 2000.00) {
      percentual = 7;
      calculation_and_print(salario, percentual);
    } else if (salario > 2000.00) {
      percentual = 4;
      calculation_and_print(salario, percentual);
    }
    entrada.close();
  }

  private static void calculation_and_print(double salario, int percentual) {
    double reajuste;
    double novo_salario;
    reajuste = salario * (percentual / 100.00);
    novo_salario = salario + reajuste;
    System.out.printf("Novo salario: %.2f\n", novo_salario);
    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
    System.out.println("Em percentual: " + percentual + " %");
  }
}