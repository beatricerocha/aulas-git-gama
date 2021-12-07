package exercicios.exercicio02;

public class AppEbook {
  public static void main(String[] args) {

    Ebook livro = new Ebook("Hunger games", "S. Collins", 300);

    // livro.retrocederPagina();
    // System.out.println("Página atual: " + livro.exibirPagina());

    // livro.irParaPagina(350);
    // System.out.println("Página atual: " + livro.exibirPagina());

    // livro.avancarPagina();
    // System.out.println("Página atual: " + livro.exibirPagina());

    // livro.retrocederPagina();
    // System.out.println("Página atual: " + livro.exibirPagina());

    livro.mostrarCapa();

  }
}
