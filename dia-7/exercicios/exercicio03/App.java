package exercicios.exercicio03;

public class App {
  public static void main(String[] args) {
    Pessoa p = new Pessoa("José", "111");
    Estudante e = new Estudante("Ana", "222", "ADM");
    Professor prof = new Professor("Larissa", "13 89876-1234", 3000);

    System.out.println(p.getDados());
    System.out.println(e.getDados());
    System.out.println(prof.getDados());
  }
}
