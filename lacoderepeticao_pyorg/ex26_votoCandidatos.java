package lacoderepeticao_pyorg;


import java.util.Scanner;
public class ex26_votoCandidatos {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos eleitores irão votar: ");
        int totalEleitores = sc.nextInt();


        int voto, totalCand1 = 0, totalCand2 = 0, totalCand3 = 0;

        for(int i = 1; i <= totalEleitores; i++){


            System.out.println("Eleitor " + i + " Escolha entre os candidatos [1 / 2 / 3]:");
            voto = sc.nextInt();
            while(voto < 1 || voto > 3){
                System.out.println("Numero invalido\nEleitor " + i + " Escolha entre os candidatos [1 / 2 / 3]:");
                voto = sc.nextInt();
            }


            if(voto == 1){
                totalCand1 += 1;
            } else if(voto == 2){
                totalCand2 += 1;
            } else if(voto == 3){
                totalCand3 += 1;
            }


        }
        System.out.println("Candidato 1 teve " + totalCand1 + " votos.");

        System.out.println("Candidato 2 teve " + totalCand2 + " votos.");

        System.out.println("Candidato 3 teve " + totalCand3 + " votos.");
    }

    /**
     * Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
     * Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
     * */
}
