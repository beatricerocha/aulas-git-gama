public class AppPlacar {
  public static void main(String[] args) {
    Placar placar1 = new Placar();
    Placar placar2 = new Placar("Corinthians", "São Paulo");
    Placar placar3 = new Placar("Corinthians", "São Paulo", 5, 0);

    System.out.println(placar1.getPlacar());
    System.out.println(placar2.getPlacar());
    System.out.println(placar3.getPlacar());
  }
}
