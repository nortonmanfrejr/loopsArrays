package loops;

import java.util.Scanner; // Biblioteca chamada para criar o objeto Scanner

public class ex1_nomeIdade {

    /*
    Faça um programa que leia o conjunto de dois valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare o programa inserindo o valor 0 no campo do nome)
    * */


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // Metodo construtor para fazer um novo Scanner

        // Declaração de variaveis para Nome e Idade
        String nome;
        int idade;

        //Inicio do laço de Repetição

        System.out.println("Exercicio Nome e Idade.\n");

        while (true) {

            System.out.print("Nome: ");
            nome = sc.next();
            if (nome.equals("0")) break;

            System.out.print("Idade: ");
            idade = sc.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
