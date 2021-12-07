package exercicio01;

public class Relogio {
  // atributos
  private int hora, minuto, segundo;

  // construtor
  public Relogio(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;

  }

  public void exibirHora() {
    System.out.println("Hora Atual " + hora + " : " + minuto + " : " + segundo);
  }

  public int getHoras() {
    return hora;
  }

  public void setHoras(int novaHora) {
    if (novaHora > 0)
      hora = novaHora;
  }
}
