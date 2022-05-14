package exercicios.lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex44_eleicao {

    public static void main(String[] args){

        double candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, count = 0;
        double voto, votoBranco = 0, votoNulo =0;
        boolean toContinue = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Candidato 1 - 1\nCandidato 2 - 2\nCandidato 3 - 3\nCandidato 4 - 4\nNulo - 5\nBranco - 6\nEncerrar - 0\n");

        while(toContinue){


            count++;

            System.out.print("Digite o codigo do seu candidato: ");
            voto = sc.nextInt();
            while(voto < 0 || voto > 6){
                System.out.println("Codigo invalido!!");
                System.out.print("Digite o codigo do seu candidato: ");
                voto = sc.nextInt();
                }

            if(voto == 0){
                toContinue = false;
            } else if (voto == 1){
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else if (voto == 4) {
                candidato4++;
            } else if (voto == 5) {
                votoBranco++;
            } else {
                votoNulo++;
            }
        }

        System.out.println("Candidato 1 --> " + candidato1 + " votos.");
        System.out.println("Candidato 2 --> " + candidato2 + " votos.");
        System.out.println("Candidato 3 --> " + candidato3 + " votos.");
        System.out.println("Candidato 4 --> " + candidato4 + " votos.");
        System.out.println(Math.round((votoNulo / count) * 100) + "% nulos sobre o total de votos."); // Porcentagem voto nulo
        System.out.println(Math.round((votoBranco / count) * 100) + "% brancos sobre o total de votos");// Porcentagem voto branco
    }

}



//        Faça um programa que calcule e mostre:
//        O total de votos para cada candidato; x
//        O total de votos nulos; x
//        O total de votos em branco; x
//        A percentagem de votos nulos sobre o total de votos;
//        A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.