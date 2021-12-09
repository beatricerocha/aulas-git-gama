import java.util.HashMap;

/**
 * Exemplo1
 */
public class Exemplo1 {

  public static void main(String[] args) {
    // chave e valor
    HashMap<Integer, String> mapa = new HashMap<>();
    mapa.put(1, "um");
    mapa.put(2, "dois");
    mapa.put(3, "três");

    String resposta = mapa.get(2);
    System.out.println(resposta);
    System.out.println(mapa.get(2));
  }
}