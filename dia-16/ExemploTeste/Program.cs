using System;

class Program
{
  static void Main(string[] args)
  {
    int i, aprovados = 0, reprovados = 0, exames = 0;
    double mediaAluno, nota1, nota2, soma = 0, media;

    for (i = 1; i <= 6; i++)
    {

      Console.Write("Informe a nota 1 do aluno {0}: ", i);
      nota1 = double.Parse(Console.ReadLine());
      Console.Write("Informe a nota 2 do aluno {0}: ", i);
      nota2 = double.Parse(Console.ReadLine());
      mediaAluno = (nota1 + nota2) / 2;
      if (mediaAluno <= 3)
      {
        Console.WriteLine("Reprovado !");
        reprovados++;
      }
      else if (mediaAluno < 7)
      {
        Console.WriteLine("Exame Especial");
        exames++;
      }
      else
      {
        Console.WriteLine("Aprovado !");
        aprovados++;
      }
      soma = soma + mediaAluno;
    }
    Console.WriteLine("Total aprovados: " + aprovados);
    Console.WriteLine("Total reprovados: " + reprovados);
    Console.WriteLine("Total exame especial: " + exames);
    media = soma / 6;
    Console.WriteLine("Média da classe: " + media);
  }
}

/*using System;


class Program {
  public static void Main (string[] args) {
    int num = 1, contPar = 0, contImpar = 0; 
    double percPares, percImpares, total; 
    int somaPar = 0, somaImpar = 0;

    Console.WriteLine("Digite um número:");
    num = int.Parse(Console.ReadLine());
    while (num != 0) {
      
      if (num > 0) {
        if (num % 2 == 0) {        
        somaPar += num; 
        contPar++;
        } else {
        somaImpar += num;
        contImpar++;
        }
      } else {
        Console.WriteLine("Opção inválida!");
      }

      Console.WriteLine("Digite outro número:");
      num = int.Parse(Console.ReadLine());
    }

    total = contPar + contImpar;
    percPares = (contPar / total) * 100;  
    percImpares = (contImpar / total) * 100;

    Console.WriteLine("O percentual de números pares são {0}% e a soma deles são {1}.", percPares, somaPar);
    Console.WriteLine("O percentual de números ímpares são {0}% e a soma deles são {1}.", percImpares, somaImpar);
  }
}*/

/*
WHILE - MENU DE OPÇÕES :
class Program {
  public static void Main (string[] args) {
    int opcao = 0, num1, baseP, expoente;

    while (opcao != 3) {
      Console.WriteLine("Menu de Opções: ");
      Console.WriteLine("1 - Raíz Quadrada de um número");
      Console.WriteLine("2 - Um número elevado ao outro");
      Console.WriteLine("3 - Sair");

      Console.WriteLine("Opção: ");
      opcao = int.Parse(Console.ReadLine());

      switch (opcao) {
          case 1: 
            Console.Write("Raiz Quadrada - Informe um número: ");
            num1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Raiz Quadrada = {0}\n", Math.Sqrt(num1));
            break;
          case 2: 
            Console.Write("Potência - Informe a base: ");
            baseP = int.Parse(Console.ReadLine());
            Console.Write("Potência - Informe o expoente: ");
            expoente = int.Parse(Console.ReadLine());
            Console.WriteLine("Potência = {0}\n", Math.Pow(baseP, expoente));
            break;
          case 3: 
            break;
          default: 
            Console.Write("Opção invalida !\n"); 
            break;
      }
    }
  }
}


/*using System;
class Program
{
    static void Main(string[] args)
    {
      char opcao='x';
      double salario, salarioTotal=0;

      Console.WriteLine("Digite seu salário: ");
      salario = double.Parse(Console.ReadLine());
      while (opcao != 'D') {
        salarioTotal = salarioTotal + salario;
        Console.WriteLine("Menu de opções:");
        Console.WriteLine("A — Para aumento de 8% ");
        Console.WriteLine("B — Para aumento de 11% ");
        Console.WriteLine("C — Para aumento fixo de R$ 450,00 ");
        Console.WriteLine("D — Sair do programa ");
       
        Console.Write("Opção: ");
        opcao = char.ToUpper(char.Parse(Console.ReadLine()));

       switch (opcao) {
          case 'A': Console.Write("aumento de 8%\n");
                  salarioTotal = salarioTotal * 1.08;
                  Console.WriteLine(" é igual " + salarioTotal);
                  break;
          case 'B': Console.Write("aumento de 11%\n");
                  salarioTotal = salarioTotal * 1.11;
                  Console.WriteLine(" é igual " +salarioTotal);
                  break;
          case 'C': Console.Write("aumento de R$:450,00\n");
                  salarioTotal = salarioTotal +450;
                  Console.WriteLine(" é igual " + salarioTotal);
                  break;
          
           case 'D': 
                  break;
          default: Console.Write("Opção invalida!\n\n"); break;
        }
      }
    }
}*/




/*using System;

class Program {
  public static void Main (string[] args) {
    int num=0, opcao=1, soma=0;
    Console.Write("Digite um número: ");
    num = int.Parse(Console.ReadLine()); 
    while (num != -1){
    soma= soma+num;
    Console.Write("Digite um número: ");
    num = int.Parse(Console.ReadLine()); 
    opcao++;
   
    }
    Console.WriteLine("Soma: " + soma);
  }
}
*/
/*ex 04
using System;

class Program {
  public static void Main (string[] args) {
    int num=0, opcao=1;
   
    while (num >=0){
    Console.Write("Digite o " + opcao+ "° número: ");
    num = int.Parse(Console.ReadLine()); 
    opcao++;
   
    }
  }
}
*/

/*03
using System;

class Program {
  public static void Main (string[] args) {
    int i, opcao=1;
    double nota=0, soma=0;
   
    for (  i=0;i<5; i++){
   
    Console.Write("Digite a " + opcao+ "° nota: ");
    nota = double.Parse(Console.ReadLine());

    soma=soma+nota;    
    opcao++;
   
    }
    Console.WriteLine(" Soma: "+soma);
    Console.WriteLine(" Média: "+soma/5);
  }
}
*/
/*ex 02
using System;

class Program {
  public static void Main (string[] args) {
    int i;
    
    for ( i=100; i<=110; i++){
  
    Console.WriteLine(i);
    }
  }
}
*/
/*ex01
using System;

class Program {
  public static void Main (string[] args) {
    int i;
    
    for ( i=1; i<=100; i++){
  
    Console.WriteLine(i + "\t");
      if (i %10 == 0){
        Console.WriteLine();
      }
    }
  }
}*/

/*02
using System;

class Program {
  public static void Main (string[] args) {
    int i, opcao=1;
    double nota=0, soma=0;
     i=0;
    while (i<10){
   
    Console.Write("Digite a " + opcao+ "° nota: ");
    nota = double.Parse(Console.ReadLine());

    soma=soma+nota;    
    opcao++;
    i++;
    }
    Console.WriteLine(" Soma: "+soma);
    Console.WriteLine(" Média: "+soma/10);
  }
}
*/

/*01
using System;

class Program {
  public static void Main (string[] args) {
    int i, opcao=1;
    double nota=0, soma=0;

    for (i=0; i<10; i++){
    Console.Write("Digite a " + opcao+ "° nota: ");
    nota = double.Parse(Console.ReadLine());

    soma=soma+nota;    
    opcao++;
    }
    Console.WriteLine(" Soma: "+soma);
    Console.WriteLine(" Média: "+soma/10);
  }
}
*/

/*
class Program
{
    static void Main(string[] args)
    {
      int i, opcao;
      double num1, basep, expoente;

      for(i = 1; i <= 5; i++) {
        Console.WriteLine("Menu de opções:");
        Console.WriteLine("1- Raiz quadrada de um número");
        Console.WriteLine("2- Um número elevado a outro número");
        Console.WriteLine("3- Sair\n");

        Console.Write("Opção: ");
        opcao = int.Parse(Console.ReadLine());

        switch (opcao) {
          case 1: Console.Write("Raiz Quadrada - Informe um número: ");
                  num1 = double.Parse(Console.ReadLine());
                  Console.WriteLine("Raiz Quadrada = {0}\n", Math.Sqrt(num1));
                  break;
          case 2: Console.Write("Potência - Informe a base: ");
                  basep = double.Parse(Console.ReadLine());
                  Console.Write("Potência - Informe o expoente: ");
                  expoente = double.Parse(Console.ReadLine());
                  Console.WriteLine("Potência = {0}\n", Math.Pow(basep, expoente));
                  break;
          case 3: i = 5; break;
          default: Console.Write("Opção invalida !\n\n"); break;
        }
      }
    }
}
*/