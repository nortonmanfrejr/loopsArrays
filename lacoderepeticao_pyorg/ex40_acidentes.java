package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex40_acidentes {

    public static void main(String[] args) {
        int menorIndice = Integer.MAX_VALUE;
        int maiorIndice = Integer.MIN_VALUE;
        int idMeIndice = 0;
        int idMaIndice = 0;
        int somaVeiculos = 0;
        int somaVeiculosMenos2000 = 0;
        int count = 0;
        int veiculosMenos2000 = 0;
        Scanner sc = new Scanner(System.in);

        while(count < 5) {
            ++count;
            System.out.print("Codigo cidade: ");
            int idCidade = sc.nextInt();
            System.out.print("Codigo cidade: " + idCidade + "Veiculos a passeio: ");
            int numeroVeiculos = sc.nextInt();
            somaVeiculos += numeroVeiculos;
            System.out.print("Codigo cidade: " + idCidade + "Acidentes ocorridos: ");
            int numeroAcidentes = sc.nextInt();
            if (numeroAcidentes > maiorIndice) {
                maiorIndice = numeroAcidentes;
                idMaIndice = idCidade;
            }

            if (numeroAcidentes < menorIndice) {
                menorIndice = numeroAcidentes;
                idMeIndice = idCidade;
            }

            if (numeroAcidentes < 2000) {
                ++veiculosMenos2000;
                somaVeiculosMenos2000 += numeroVeiculos;
            }
        }

        int mediaVeiculosMenos2000 = somaVeiculosMenos2000 / veiculosMenos2000;
        int mediaVeiculos = somaVeiculos / 5;
        System.out.println("Maior indice: " + maiorIndice + " --> Codigo Cidade: " + idMaIndice);
        System.out.println("Menor indice: " + menorIndice + " --> Codigo Cidade: " + idMeIndice);
        System.out.println("Media de veiculos todas as cidades: " + mediaVeiculos);
        System.out.println("Media de veiculos menor que 2000 acidentes: " + mediaVeiculosMenos2000);
    }
}
