package exercicios.exercicio03;

/**
 * Veiculo
 */
public class Veiculo {

  String modelo, marca;
  double consumo;

  Veiculo(String modelo, String marca, double consumo) {
    this.modelo = modelo;
    this.marca = marca;
    this.consumo = consumo;
  }

  void exibirDados() {
    System.out.println("Modelo" + modelo);
    System.out.println("Marca" + marca);
    System.out.println("Consumo " + consumo);
  }

  double obterConsumo() {
    return consumo;
  }
}