package modelo;

public class ContaEspecial extends Conta {

  private double limite;

  public ContaEspecial(int nConta, double limite) {
    super(nConta);
    this.limite = limite;
  }

  @Override
  public boolean saque(double valor) {
    if (valor <= getSaldo() + limite) {
      return super.saque(valor);// saldo = saldo -valor;
    }
    return false;
  }

  @Override
  public String toString() {
    return "CE: " + super.toString() + " limite=" + limite;
  }
}
