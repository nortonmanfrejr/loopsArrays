package exercicios.lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex45_prova {

    public static void main(String[] args){

        int totalAlunos = 0, idAluno, idMaisAcerto = Integer.MIN_VALUE, idMenosAcerto = Integer.MAX_VALUE;
        int totalAcertos = 0,maiorAcerto = Integer.MIN_VALUE, menorAcerto = Integer.MAX_VALUE;
        int somaTotalAcertos = 0;
        String novoAluno, quest;
        boolean inProva = true;

        Scanner sc = new Scanner(System.in);


            while (inProva) {

                totalAlunos++;

                System.out.print("ID Aluno: ");
                idAluno = sc.nextInt();

                for (int i = 1; i <= 10; i++) {

                    System.out.print(i + " - :");
                    quest = sc.next();

                    if (i == 1 && quest.equalsIgnoreCase("a")) {
                        totalAcertos++;
                    } else if (i == 2 && quest.equalsIgnoreCase("b")) {
                        totalAcertos++;
                    } else if (i == 3 && quest.equalsIgnoreCase("c")) {
                        totalAcertos++;
                    } else if (i == 4 && quest.equalsIgnoreCase("d")) {
                        totalAcertos++;
                    } else if (i == 5 && quest.equalsIgnoreCase("a")) {
                        totalAcertos++;
                    } else if (i == 6 && quest.equalsIgnoreCase("b")) {
                        totalAcertos++;
                    } else if (i == 7 && quest.equalsIgnoreCase("c")) {
                        totalAcertos++;
                    } else if (i == 8 && quest.equalsIgnoreCase("d")) {
                        totalAcertos++;
                    } else if (i == 9 && quest.equalsIgnoreCase("a")) {
                        totalAcertos++;
                    } else if (i == 10 && quest.equalsIgnoreCase("b")) {
                        totalAcertos++;
                    }
                }
                somaTotalAcertos += totalAcertos;


                // Mais acertos
                if (totalAcertos > maiorAcerto) {
                    maiorAcerto = totalAcertos;
                    idMaisAcerto = idAluno;
                }
                // Menos acertos
                if (totalAcertos < menorAcerto) {
                    menorAcerto = totalAcertos;
                    idMenosAcerto = idAluno;
                }
                // Encerramento
                System.out.print("Mais um aluno para fazer a prova [S/N]? --> ");
                novoAluno = sc.next();
                if (novoAluno.equalsIgnoreCase("n")) {
                    inProva = false;
                }
            }
        System.out.println("------------------------------");
        System.out.println("GABARITO DA PROVA:");
        System.out.println("1 - A\n2 - B\n3 - C\n4 - D\n5 - A\n6 - B\n7 - C\n8 - D\n9 - A\n10 - B");

        System.out.println("------------------------------");
        System.out.println("Provas realizadas --> " + totalAlunos);
        System.out.println("Mais acertos --> " + maiorAcerto + " ID --> " + idMaisAcerto);
        System.out.println("Menos acertos --> " + menorAcerto + " ID --> " + idMenosAcerto);
        System.out.println("A media da turma é --> " + (somaTotalAcertos / totalAlunos) + " acertos.");
    }
}

//    Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões,
//    o programa deve perguntar ao aluno a resposta de cada questão e ao final comparar com o
//    gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1 ponto por resposta certa).
//    Após cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno vai utilizar o sistema.
//    Após todos os alunos terem respondido informar:


//        Maior e Menor Acerto;
//        Total de Alunos que utilizaram o sistema;
//        A Média das Notas da Turma.
//        Gabarito da Prova:
//
//        01 - A
//        02 - B
//        03 - C
//        04 - D
//        05 - E
//        06 - E
//        07 - D
//        08 - C
//        09 - B
//        10 - A
//        Após concluir isto você poderia incrementar o programa permitindo que o professor digite o
//        gabarito da prova antes dos alunos usarem o programa.