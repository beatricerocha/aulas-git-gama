package exercicios;

public class Exercicio02 {
  public static void main(String[] args) {

  }

  public static int numeros(int num1, int num2, int num3) {

    if (num1 <= num2 && num1 <= num3) {
      return num1;
    }
    if (num2 <= num1 && num2 <= num3) {
      return num2;
    }
    return num3;
  }

}
