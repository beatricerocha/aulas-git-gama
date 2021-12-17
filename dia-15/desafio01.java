using System;

class Program {
  public static void Main (string[] args) {
    string pessoa, ocupacao, animal, amigo, problema, ferramenta, criaturamarinha;
    Console.WriteLine("PREENCHA PARA COMPLETAR A HISTÓRIA:  ");
    Console.WriteLine("Seu Nome: ");
    pessoa = Console.ReadLine();
    Console.WriteLine("Sua Profissão: ");
    ocupacao = Console.ReadLine();
		Console.WriteLine("Animal favorito: ");
    animal = Console.ReadLine();
    Console.WriteLine("Nome de um Amigo: ");
    amigo = Console.ReadLine();
    Console.WriteLine("Um problema: ");
    problema = Console.ReadLine();
    Console.WriteLine("Uma ferramenta: ");
    ferramenta = Console.ReadLine();
    Console.WriteLine("Uma criatura do mar:");
    criaturamarinha = Console.ReadLine();

    Console.WriteLine ("Era uma vez uma pessoa chamada {0}, {0} estava muito contente sendo {1},mas as vezes as tarefas se tornavam muito dificeis de realizar.\n Um dia, {0} descobriu que a desilusao de {4} estava se repetindo com muita frequencia em sua vida.\n Eu nao suporto mais ser {1}! gritou {0}, enquanto segurava o {5} com raiva.\n{4} nao vai me impedir de realizar os meus sonhos!\n O que eu realmente quero, disse {0}, era ser como {3}. Eis uma pessoa para ser admirada. Entao {0} largou {5} para sempre, e seguiu {3} na criacao de {2}. Finalmente, {0} se sentiu tao feliz como um(a) {6}   .", pessoa, ocupacao, animal, amigo, problema, ferramenta, criaturamarinha);  
  }
}