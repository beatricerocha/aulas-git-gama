package exercicio01;

public class AppRelogio {
  public static void main(String[] args) {
    Relogio relogio = new Relogio(1, 20, 20);

    System.out.println(relogio.getHoraAtual());

    relogio.setHora(12);

    System.out.println(relogio.getHoraAtual());
  }
}
