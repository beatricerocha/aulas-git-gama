package exemplos.exemplo03;

public class Pessoa {
  // classe é um modelo tem que se criar um objeto
  // atributo = caracteristicas.
  String nome;
  double altura;

  // metodo construtor
  // Nome = Nome da classe, náo pode ter retorno, nem void
  Pessoa(String nome, double altura) {
    this.nome = nome;
    this.altura = altura;

  }
  // metotos = faz comportamento

  void apresentar() {
    System.out.println("Olá eu sou: " + nome);
    System.out.println("Tenho " + altura + "m");
  }
}
