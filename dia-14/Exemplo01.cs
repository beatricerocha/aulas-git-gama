using System;

class Program {
  public static void Main (string[] args) {
  int num1, num2, soma, mult;
    Console.WriteLine ("Informe primeiro número:" );
    num1 = int.Parse(Console.ReadLine()); 

    Console.WriteLine("Informe segundo número:");
    num2 = int.Parse(Console.ReadLine()); 

    soma = num1 + num2;
    mult = soma + num1;

    Console.WriteLine ("Soma:" + soma);
    Console.WriteLine("Total: " + mult);
  }
}