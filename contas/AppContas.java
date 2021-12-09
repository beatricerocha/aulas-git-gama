import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

public class AppContas {
  public static void main(String[] args) {

    ContaPoupanca conta3 = new ContaPoupanca(123);

    Conta conta1 = new Conta(123);

    System.out.println(conta1);

    conta1.deposito(200);
    System.out.println(conta1);

    conta1.saque(300);

    ContaCorrente conta = new ContaCorrente(123);
    System.out.println(conta);

    conta.deposito(200);
    System.out.println(conta);

    if (conta.saque(300)) {
      System.out.println("Saque realizado!\n");
    } else {
      System.out.println("Saldo insuficiente!\n");
    }
    System.out.println("Resultado " + conta);

    ContaEspecial conta2 = new ContaEspecial(123, 100);
    System.out.println(conta2);

    conta.deposito(200);
    System.out.println(conta2);

    if (conta.saque(300)) {
      System.out.println("Saque realizado!\n");
    } else {
      System.out.println("Saldo insuficiente!\n");
    }
    System.out.println("Resultado " + conta2);
  }
}
