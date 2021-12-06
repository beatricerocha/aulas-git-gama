package exercicios;

public class Exercicio01 {
  public static void main(String[] args) {
    boolean resultado = false;
    resultado = verificaPar(11);
    if (resultado) {
      System.out.println("Número é par");
    } else {
      System.out.println("Número é impar");
    }
  }

  public static boolean verificaPar(int numero) {
    if (numero % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}