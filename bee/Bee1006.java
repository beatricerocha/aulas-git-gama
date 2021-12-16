import java.util.Scanner;

public class Bee1006 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double a, b, c, m;

    a = entrada.nextDouble();
    b = entrada.nextDouble();
    c = entrada.nextDouble();

    m = (a / 10 * 2) + (b / 10 * 3) + (c / 10 * 5);
    String media = String.format("MEDIA = %,.1f", m);

    System.out.print(media + "\n");
    entrada.close();
  }
}