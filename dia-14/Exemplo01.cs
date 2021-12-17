 /* EXEMPLO 1 
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
*/
/*
EXERCÍCIO 1
Faça um programa que imprima na tela a frase: “Olá Mundo!”.

using System;

class Program {
  public static void Main (string[] args) {
    Console.WriteLine ("Óla Mundo!" );
  }
}
*/
/*
 EXERCÍCIO 2
Escreva um programa que imprima o seu nome completo na tela.

using System;

class Program {
  public static void Main (string[] args) {
    Console.WriteLine ("Beatrice Rocha" );
  }
}
*/
/*
 EXERCÍCIO 3
Escreva um algoritmo que imprima na tela a seguinte mensagem:
“A programação é aprendida escrevendo programas” (Brian Kernighan)

using System;

class Program {
  public static void Main (string[] args) {
    Console.WriteLine ("A programação é aprendida escrevendo programas” (Brian Kernighan)");
  }
}
*/
/*
 EXERCÍCIO 4
Crie um programa que imprima o produto entre os números 25 e 27.
using System;

class Program {
  public static void Main (string[] args) {
    int num = 25+27;
    Console.WriteLine ("O resultado é: " + num);
  }
}
*/
/*
 EXERCÍCIO 5
Faça um programa que leia um número inteiro e mostre-o na tela, por exemplo, da seguinte forma:
O número inteiro digitado foi 4
using System;

class Program {
  public static void Main (string[] args) {

    int num;
    Console.WriteLine ("Informe um número:" );
    num = int.Parse(Console.ReadLine()); 
    Console.WriteLine ("O número digitado é: " + num);
    
  }
}
*/
/*
 EXERCÍCIO 6
Faça um programa que leia e imprima dois números inteiros na tela.

using System;

class Program {
  public static void Main (string[] args) {

    int num1, num2;
     Console.WriteLine ("Informe primeiro número:" );
    num1 = int.Parse(Console.ReadLine()); 

    Console.WriteLine("Informe segundo número:");
    num2 = int.Parse(Console.ReadLine()); 
    
  }
}
*/
/*
 EXERCÍCIO 7
Faça um programa que receba três notas, calcule e mostre a média aritmética.

using System;

class Program {
  public static void Main (string[] args) {
  double num1, num2, num3, media;
    Console.WriteLine ("Informe primeira nota:" );
    num1 = int.Parse(Console.ReadLine()); 

    Console.WriteLine("Informe segunda nota:");
    num2 = int.Parse(Console.ReadLine()); 

    Console.WriteLine("Informe terceira nota:");
    num3 = int.Parse(Console.ReadLine()); 

    media = (num1 + num2+ num3)/3;

    Console.WriteLine ("Media:" + media);
  }
}
*/
/*
EXERCÍCIO 12
Um funcionário recebe um salário fixo mais 5,5% de comissão sobre as vendas. Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas no mês, calcule e mostre a comissão e seu salário final.
using System;

class Program {
  public static void Main (string[] args) {
  double salario, vendas, comisao, total;
    Console.WriteLine ("Informe seu salário atual:" );
    salario = double.Parse(Console.ReadLine()); 

    Console.WriteLine("Informe as vendas:");
    vendas = double.Parse(Console.ReadLine()); 

    comisao = vendas * 5.5/100;
    total = salario + comisao;

    Console.WriteLine ("Comissão:" + comisao);
    Console.WriteLine("Salario Final: " + total);
  }
}
*/
/*
EXERCÍCIO 19
Escreva um programa que leia um número inteiro no formato: centenas (C), dezenas (D) e Unidades (U); e imprima o número invertido. O número deverá ser armazenado em uma variável antes de ser impresso e você deverá usar apenas operadores matemáticos para resolver essa questão.

using System;

class Program {
  public static void Main (string[] args) {
  int num1, num2, unid, dez, cent;
    Console.WriteLine ("Informe um número com 3 digitos:" );
    num1 = int.Parse(Console.ReadLine()); 

    unid = num1 % 10;
    cent = num1 / 100;
    dez = (num1/10)%10;

    Console.WriteLine("Número invertido:" + unid + dez+ cent);    
  }
}

*/