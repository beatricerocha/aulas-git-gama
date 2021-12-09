package modelo;

public class ContaPoupanca extends Conta {
  private double taxa;

  public ContaPoupanca(int nConta) {
    super(nConta);
  }

  public void setTaxaPoupança(double novaTaxa) {
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
