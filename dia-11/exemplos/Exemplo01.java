package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exemplo01
 */
public class Exemplo01 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero;
    String entrada;
    try {
      System.out.println("Digite um número: ");
      entrada = teclado.nextLine();

      numero = Integer.parseInt(entrada);// tranforma o texto em numero inteiro
      System.out.println("Você digitou " + numero);
    } catch (InputMismatchException e) {
      System.out.println("Valor inválido!");
    } catch (NumberFormatException e) {
      System.out.println("Erro de Conversão");
    } catch (Exception e) {
      System.out.println("Erro.");
      System.out.println(e.getMessage());
    } finally {
      teclado.close();
      System.out.println("Fechando...");
    }
    System.out.println("Fim do programa!");

  }
}