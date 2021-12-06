package exercicios;

public class Exercicio01 {
  public static void main(String[] args) {
    int numero = 11;

    if (verificaPar(11)) {
      System.out.println("Número " + numero + " é par");
    } else {
      System.out.println("Número " + numero + " impar");
    }
  }

  public static boolean verificaPar(int numero) {
    if (numero % 2 == 0) {
      return true;
    }
    return false;

  }
}