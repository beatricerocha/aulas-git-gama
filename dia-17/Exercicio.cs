/*05 e 7
using System;

class Program
{
  static void Main(string[] args)
  {
  int hora, min, seg, resultado;
  int hora2, min2, seg2;
    Console.WriteLine("Digite a hora:");
    hora = int.Parse(Console.ReadLine());
   
    Console.WriteLine("Digite o min:");
    min = int.Parse(Console.ReadLine());
   
    Console.WriteLine("Digite o seg:");
    seg = int.Parse(Console.ReadLine());
resultado = converteSegundos (hora, min, seg);
      Console.WriteLine("Total em seg:{0}", converteSegundos(hora, min, seg));

  converteHora(resultado, out hora2, out min2, out seg2);
   Console.WriteLine("Hora: {0} : {1} : {2}", hora2, min2, seg2);
  }

  static int converteSegundos(int h, int m, int s){
    return h*60*60 + m *60 + s;
  }

  static void converteHora( int seg, out int h, out int m, out int s)
  {
    h= seg / 3600;
    m = (seg % 3600)/60;
    s =  (seg % 3600)%60;
  }
}*/
/*
using System;
class Program
{
  static void Main(string[] args)
  {
    int N;

    Console.WriteLine("Digite um numero:");
    N = int.Parse(Console.ReadLine());

    if (primo(N)) {
      Console.WriteLine("{0} é primo", N);
    } else {
      Console.WriteLine("{0} NÃO é primo", N);
    }
  }

  static bool primo(int N)
  {

    for (int i=2; i <= N/2; i++) {
       if (N % i == 0) {
           return false;
       }      
    }
    return true;
  }
}*/

/*03
using System;

class Program
{
  static void Main(string[] args)
  {
    double raio;
    Console.Write("Digite o raio: ");
    raio = double.Parse(Console.ReadLine());

    Console.WriteLine("Comprimento = {0:0.00}", comprimento(raio));
    Console.WriteLine("Area = {0:0.00}", area(raio));
    Console.WriteLine("Volume = {0:0.00}", volume(raio));
  }
   static double comprimento(double raio)
  {
    return Math.PI * 2 * raio;
  }
   static double area(double raio)
  {
    return Math.PI * raio * raio;
  }
   static double volume(double raio)
  {
    return 4.0/3.0 * Math.PI * 2 * Math.Pow(raio, 3);
  }
}*/
/*02
using System;

class Program
{
  static void Main(string[] args)
  {
    int n;
    Console.WriteLine("Digite um numero:");
    n = int.Parse(Console.ReadLine());

    Console.WriteLine("Fatorial = {0}", fatorial(n));
  }
   static long fatorial(int n)
  {
    long fat=1,i;

    for (i =1; i<=n; i++){
      fat= fat*i;
    }
   return fat;
  }
}*/

/*01
using System;

class Program
{
  static void Main(string[] args)
  {
    int n;
    Console.WriteLine("Digite um numero:");
    n = int.Parse(Console.ReadLine());
Console.WriteLine("Somatorio = {0}", soma(n));
  }
   static int soma(int n)
  {
    int soma=0,i;

    for (i =2; i<n; i=i+2){
      soma= soma+i;
    }
   return soma;
  }
}
*/


/*using System;

class Program
{
  static void Main(string[] args)
  {
    int num1, num2;

    Console.WriteLine("Digite um numero:");
    num1 = int.Parse(Console.ReadLine());
    Console.WriteLine("Digite outro numero:");
    num2 = int.Parse(Console.ReadLine());
   
    
    if ( ehDivisivel(num1, num2) ) {
      Console.WriteLine("{0} é divisível por {1}", num1, num2);
    } else {
            Console.WriteLine("{0} NÃO é divisível por {1}", num1, num2);
    }
  }

  static bool ehDivisivel(int num1, int num2)
  {
    int divisao, resto;

    // 20 / 7 = 2
    divisao = num1 / num2;
    //          20 - 7 * 2 = 6
    resto  = num1 - num2 * divisao;
    return resto == 0;
  }
}
*/

/*using System;

class Program {
  public static void Main (string[] args) {
   int num1,num2, num3;

   Console.WriteLine("Digite um numero: ");
   num1 = int.Parse(Console.ReadLine());

    Console.WriteLine("Digite um numero: ");
   num2 = int.Parse(Console.ReadLine());

    Console.WriteLine("Digite um numero: ");
   num3 = int.Parse(Console.ReadLine());

   exibeEmOrdem (num1, num2, num3);
  }

  static void exibeEmOrdem(int a, int b, int c){
    if (a<=b && a <=c){
      Console.WriteLine(a + " ");
      if(b <c){
        Console.WriteLine(" " + b + " "+c);
      }else{
    Console.WriteLine(" " + c + " "+ b);
      }
    } else if(b<=a && b <=c){
      Console.WriteLine(b + " ");

      if (a <=c){
        Console.WriteLine(" " + a + " "+c);
      }else{
        Console.WriteLine(" " + c + " "+ a);
      }
    } else{
      Console.WriteLine(c + " ");
      if(a <b){
  Console.WriteLine(" " + a + " "+b);
      } else {
        Console.WriteLine(" " + b + " "+ a);
      }
    }
  }
  
}*/

/*
using System;

class Program
{
  static void Main(string[] args)
  {
    int num1, num2, num3;

    Console.WriteLine("Digite um numero:");
    num1 = int.Parse(Console.ReadLine());
    Console.WriteLine("Digite outro numero:");
    num2 = int.Parse(Console.ReadLine());
    Console.WriteLine("Digite só mais um numero:");
    num3 = int.Parse(Console.ReadLine());
    
    exibeEmOrdem(num1, num2, num3);
  }

  static void exibeEmOrdem(int a, int b, int c)
  {
      if (a <= b && a <= c) {  // testa se a é o menor
        Console.Write(a + " ");
        Console.Write(menorDeDois(b,c) + " ");
        Console.Write(maiorDeDois(b,c));
      } else if (b <= a && b <= c) {
        Console.Write(b + " ");
        Console.Write(menorDeDois(a,c) + " ");
        Console.Write(maiorDeDois(a,c));
      } else {
        Console.Write(c + " ");
        Console.Write(menorDeDois(a,b) + " ");
        Console.Write(maiorDeDois(a,b));
      }
      Console.WriteLine();
  }

  static int menorDeDois(int x, int y)
  {
     if (x <= y) {
       return x;
     } else {
       return y;
     }
  }

  static int maiorDeDois(int x, int y)
  {
     if (x >= y) {
       return x;
     } else {
       return y;
     }
  }
}*/