package modelo;

public class Conta {
  private int nConta;
  private double saldo;

  public Conta(int nConta) {
    this.nConta = nConta;
  }

  public String getNumero() {
    return "Número da Conta" + nConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public boolean deposito(double valor) {
    if (valor > 0) {
      saldo += valor;// saldo = saldo + valor;
      return true;
    }
    return false;
  }

  public boolean saque(double valor) {
    if (valor > 0) {
      saldo -= valor;// saldo = saldo -valor;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return nConta + ": " + saldo;
  }
}