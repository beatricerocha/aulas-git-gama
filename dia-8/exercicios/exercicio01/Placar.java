public class Placar {
  String time1, time2;
  int gol1, gol2;

  public Placar() {
    time1 = "Time da casa ";
    time2 = "Visitante";
    // opcional int começa com 0
    // gol1 = 0;
    // gol2 = 0;
  }

  public Placar(String time1, String time2) {
    this.time1 = time1;
    this.time2 = time2;
    gol1 = 0;
    gol2 = 0;
  }

  public Placar(String time1, String time2, int gol1, int gol2) {
    this.time1 = time1;
    this.time2 = time2;
    this.gol1 = gol1;
    this.gol2 = gol2;
  }

  public String getPlacar() {
    return time1 + " " + gol1 + " VS " + time2 + " " + gol2;
  }

}
