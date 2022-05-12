package lacoderepeticao_pyorg;

import java.util.Scanner;
import java.util.Random;


public class ex27_alunoMediaSala {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random(); // Construtor de randomizador

        double mediaAlunos = 0;
        int qntSala = 0, qntAlunoSala = 0, somaTotalAluno = 0;


        System.out.println("Quantas salas tem na instituição: ");
        qntSala = sc.nextInt();

        for(int i = 1; i <= qntSala; i++){

            /**
             * Utilizei o metodo random para gerar automaticamente a quantia de alunos na sala, com uma quantia minima
             * de 15 alunos por sala.
             *
             * Ao final da classe estara comentado o metodo que seria utilizado sem usar o metodo random.
             * */

            qntAlunoSala = rd.nextInt(25) + 15;
            System.out.println(qntAlunoSala + " na " + i + "º Sala.");
            somaTotalAluno += qntAlunoSala;
        }


        System.out.println(somaTotalAluno + " alunos na instituição.");

        mediaAlunos = somaTotalAluno / qntSala;
        System.out.println("A média de alunos por turma é de " + mediaAlunos);
    }



        /**
         * Sem o metodo random o laço ficara assim
         * */

//        for(int i = 1; i <= qntSala; i++){
//
//            System.out.println("Insira quantos alunos tem na " + i + "º Sala: ");
//            qntAlunoSala = sc.nextInt();
//            while(qntAlunoSala > 40){
//                System.out.println("Ultrapassou o limite da classe.\nInsira quantos alunos tem na " + i + "º Sala: ");
//                qntAlunoSala = sc.nextInt();
//            }
//            somaTotalAluno += qntAlunoSala;
//        }
//
//        mediaAlunos = somaTotalAluno / qntSala;
//        System.out.println("A média de alunos por sala é de " + mediaAlunos);
}
    /**
     * Faça um programa que calcule o número médio de alunos por turma. Para isto,
     * peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.
     * */


