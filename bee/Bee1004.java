import java.util.Scanner;

public class Bee1004 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n1, n2, PROD;

    n1 = entrada.nextInt();
    n2 = entrada.nextInt();

    PROD = n1 * n2;

    System.out.println("PROD = " + PROD);
    entrada.close();
  }
}