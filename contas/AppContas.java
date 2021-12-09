import java.util.ArrayList;
import java.util.Scanner;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

public class AppContas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int opcao = 0, numeroConta;
    double limite;

    ContaCorrente cc = null;
    ContaEspecial ce = null;
    ContaPoupanca cp = null;

    ArrayList<Conta> contas = new ArrayList<>();

    while (opcao != 7) {

      System.out.println("1- Nova CC");
      System.out.println("2- Nova CE");
      System.out.println("3- Nova CP");
      System.out.println("4- Depositar");
      System.out.println("5- Sacar");
      System.out.println("6- Consultar Saldo");
      System.out.println("7- Sair");
      System.out.println("Sua opção => ");

      opcao = teclado.nextInt();

      switch (opcao) {// if else...
        case 1:
          System.out.print("Informe o número da conta: ");
          numeroConta = teclado.nextInt();
          cc = new ContaCorrente(numeroConta);
          contas.add(cc);
          break;// interrompe

        case 2:
          System.out.print("Informe o número da conta: ");
          numeroConta = teclado.nextInt();
          System.out.print("Informe o Limite: ");
          limite = teclado.nextDouble();
          ce = new ContaEspecial(numeroConta, limite);
          contas.add(ce);
          break;

        case 3:
          System.out.print("Informe o número da conta: ");
          numeroConta = teclado.nextInt();
          System.out.print("Informe o Limite: ");
          cp = new ContaPoupanca(numeroConta);
          contas.add(cp);
          break;

        case 4:

          break;

        case 5:
          break;

        case 6:
          System.out.print("Informe o número da conta: ");
          numeroConta = teclado.nextInt();
          // for (int i = 0; i < contas.size(); i++) {
          // if (contas.get(i).getNumero() == numeroConta) {
          // System.out.println(contas.get(i));
          // break;
          // }
          // }

          for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
              System.out.println(conta);
              break;
            }
          }
          break;

        case 7:
          break;
        default: // se não for nenhum
          System.out.println("Opção inválida!");
          break;

      }
    }
    teclado.close();
  }
}
