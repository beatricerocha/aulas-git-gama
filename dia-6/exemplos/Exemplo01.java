package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

  public static void main(String[] args) {
    linha();
    System.out.println("Programa v 0.1");
    int n = 2;
    linha2(n, '-');

    linha2(1, '*');
  }

  static void linha() {
    System.out.println("------");
  }

  static void linha2(int tamanho, char simbolo) {
    for (int i = 0; i < tamanho; i++) {
      System.out.print(simbolo);
    }
    System.out.println();
  }
}