using System;

class Program
{
  public static void Main(string[] args)
  {
    double a, b, c, delta, x1, x2;
    Console.WriteLine("Digite 3 números ");
    a = double.Parse(Console.ReadLine());
    b = double.Parse(Console.ReadLine());
    c = double.Parse(Console.ReadLine());

    delta = b * b - 4 * a * c;
    if (delta >= 0)
    {
      x1 = (-b + Math.Sqrt(delta)) / (2 * a);
      x2 = (-b - Math.Sqrt(delta)) / (2 * a);
      Console.WriteLine("Raizes: x1 = {0}, x2 = {1}", x1, x2);
    }
    else
    {
      Console.WriteLine("Não tem raiz");
    }

  }
}










/*using System;

class Program {
  public static void Main (string[] args) {
    int x,y,z;
      Console.WriteLine("Digite 3 números ");
    x = int.Parse(Console.ReadLine()); 
    y = int.Parse(Console.ReadLine()); 
    z = int.Parse(Console.ReadLine()); 

    if (a+b < c || b+c< a || c+a<b  ){
      Console.WriteLine ("1");
    } else if(x == y == z){
      Console.WriteLine ("equilátero");
    } else {

    }
  
  }
}
*/


/*  EXERCICIO 1
using System;

class Program {
  public static void Main (string[] args) {
    int num=0;
    Console.WriteLine("Digite um número ");
    num = int.Parse(Console.ReadLine()); 

    if (num >20){
      Console.WriteLine (num + " é maior");
    } else if (num == 20){
      Console.WriteLine (num + " é igual");
    }
    else{
      Console.WriteLine(num + " é menor");
    }
  }
}
*/

/* EXERCICIO 2
using System;

class Program {
  public static void Main (string[] args) {
    int num1, num2, soma;
    Console.WriteLine("Digite dois números ");
    num1 = int.Parse(Console.ReadLine());
    num2= int.Parse(Console.ReadLine());
    soma=num1+num2;
    if (soma>=10){
      Console.WriteLine ("Resultado é " + (soma));
    } 
    else{
      Console.WriteLine("Não é possível fazer a adição");
    }
  }
}
*/

/* EXERCICIO 3
using System;

class Program {
  public static void Main (string[] args) {
    int num1;
    Console.WriteLine("Digite um número ");
    num1 = int.Parse(Console.ReadLine());
  
    if (num1>=0){
      Console.WriteLine ("Resultado da Raiz " + Math.Sqrt(num1));
    } 
    else{
      Console.WriteLine("Não é possível fazer raiz de números negativos");
      Console.WriteLine("Número ao quadrado:" + Math.Pow(num1, 2));
    }
  }
}
*/
/*EXERCICIO 4
using System;

class Program {
  public static void Main (string[] args) {
    int num1;
    Console.WriteLine("Digite um número ");
    num1 = int.Parse(Console.ReadLine());
  
    if (num1%3 == 0){
      Console.WriteLine (num1 + " Multiplo de 3 " );
    } 
    else{
        Console.WriteLine (num1 +" Não multiplo de 3 ");
    }
  }
}
*/

/*EXERCICIO 8

using System;

class Program {
  public static void Main (string[] args) {
    int idade;
    Console.WriteLine("Digite sua idade ");
    idade = int.Parse(Console.ReadLine());
  
    if (idade > 30){
      Console.WriteLine ("Senior");
    } 
    else if (idade > 16){
         Console.WriteLine ("Adulto");
    }
     else if (idade > 11){
         Console.WriteLine ("Adolescente");
    }
     else if (idade > 8){
         Console.WriteLine ("Juvenil");
    }
    else{
         Console.WriteLine ("Infantil" );
    }
  }
}
*/

/*EXERCICIO 9
using System;

class Program {
  public static void Main (string[] args) {
    int ano;
    Console.WriteLine("Digite um ano ");
    ano = int.Parse(Console.ReadLine());
  
    if (ano%4==0 && ano%100 !=0 || ano%400 == 0){
      Console.WriteLine ("é bissexto");
    } 
    else{
         Console.WriteLine ("Não é bissexto");
    }
  }
}
*/

/*

using System;

class Program {
  public static void Main (string[] args) {
    double salario;
    Console.WriteLine("Digite seu salário:  ");
    salario = double.Parse(Console.ReadLine());
  
    if (salario > .30){
      Console.WriteLine ("Senior");
    } 
   
  }
}
*/

/*EXERCICIO 16
using System;

class Program {
  public static void Main (string[] args) {
    double x, y;
    Console.WriteLine("Digite um número:  ");
    x = double.Parse(Console.ReadLine());
  
    if (x <= 1){
      y=1;
    } else if (x <=2) {//x > 1 && <=2
    y=2;
    }
    else if (x <= 3){
      y = x*x;
    }else{
      y = x*x*x;
    }
    Console.WriteLine("Y = {0}", y);
  }
}
*/

/**EXERCICIO 19
using System;

class Program {
  public static void Main (string[] args) {
    double a,b,c, delta, x1,x2;
    Console.WriteLine("Digite 3 números ");
    a = double.Parse(Console.ReadLine()); 
    b = double.Parse(Console.ReadLine()); 
    c = double.Parse(Console.ReadLine()); 

  delta= b*b - 4*a*c;
    if (delta >= 0){
      x1 = (-b + Math.Sqrt(delta)) / (2*a);
       x2 = (-b - Math.Sqrt(delta)) / (2*a);
       Console.WriteLine ("Raizes: x1 = {0}, x2 = {1}", x1, x2);
    } else {
      Console.WriteLine ("Não tem raiz");
    }
  
  }
}

*/