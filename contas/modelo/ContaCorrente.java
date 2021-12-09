package modelo;

public class ContaCorrente extends Conta {
  private final double TAXA_DEPOSITO = 0.1;

  public ContaCorrente(int nConta) {
    super(nConta);
  }

  @Override
  public boolean saque(double valor) {
    if (valor <= getSaldo()) {// não consigo acessar saldo pq é privado mas uso o metodo get
      return super.saque(valor);
    }
    return false; // nao tem saldo suficiente na conta
  }

  @Override
  public boolean deposito(double valor) {
    return super.deposito(valor - TAXA_DEPOSITO);
  }

  @Override
  public String toString() {
    return "CC: " + super.toString() + "\n";
  }
}
