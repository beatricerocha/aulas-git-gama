package exercicios.exercicio03;

public class App {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("José", "111");
    Estudante e = new Estudante("Ana", "222", "ADM");

    System.out.println(p.getDados());
    System.out.println(e.getDados());

  }
}
