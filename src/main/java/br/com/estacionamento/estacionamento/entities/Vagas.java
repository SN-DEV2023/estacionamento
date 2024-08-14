package br.com.estacionamento.estacionamento.entities;

public class Vagas {
  public static void main (String[] args) {

      char letra = 'A';
      int cont=0;
      char[] arrLetras=new char[26];
      do {

          arrLetras [cont] = letra ;
          letra++;
          cont++;

      }while(letra <= 'Z');



    }

}

// O que devo fazer : id
// fazer um serviço que crie dez vagas e  retorne elas com o Id e ocupadas "false"
//     ocupada