package exemplo;

public class Exemplo04 {
  public static void main(String[] args) {
    String palavra1, palavra2;
    palavra1 = "laranja";
    palavra2 = "goiaba";
    System.out.println(palavra1.equals(palavra2));// compara 2 variaveis
    System.out.println(palavra1.equals("Laranja"));// compara e faz a diferença entre MAIUSCULA E minuscula
    System.out.println(palavra1.equals("laranja"));// compara e faz a diferença entre MAIUSCULA E minuscula
    System.out.println(palavra1.equalsIgnoreCase("Laranja"));// não diferencia MAIUSCULA E minuscula
  }
}
