package exercicios.exercicio03;

/**
 * Veiculo
 */
public class AppVeiculo {
  public static void main(String[] args) {
    // class var
    Veiculo veiculo = new Veiculo("Fiat", "Uno", 9.0);

    veiculo.exibirDados();
    System.out.println("Consumo: " + veiculo.obterConsumo());

  }

}