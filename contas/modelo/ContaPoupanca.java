package modelo;

public class ContaPoupanca extends Conta {
  private static double taxa = 0.2; // atributo classe e não de cada objeto

  public ContaPoupanca(int nConta) {
    super(nConta);
  }

  public static void setTaxaPoupança(double novaTaxa) {
    taxa = novaTaxa;
  }

  @Override
  public boolean saque(double valor) {
    if (valor + taxa <= getSaldo()) {
      return super.saque(valor + taxa);
    }
    return false;// não tem saldo suficiente
  }

}
