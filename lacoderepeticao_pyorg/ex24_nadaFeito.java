package lacoderepeticao_pyorg;

import java.util.Scanner;
public class ex24_nadaFeito {


    /**
     * Faça um programa que calcule o mostre a média aritmética de N notas.
     * */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count = 0;
        double media = 0, soma = 0;
        String praContinuar;



        do{
            count++; // Contador

            System.out.println("Digite uma nota: ");
            double nota = sc.nextDouble(); // Captura das notas



            soma += nota; // Processamento do total de notas



            // Validação para continua a leitura de notas
            System.out.println("Deseja continuar lendo notas[S/N]?");
            praContinuar = sc.next();

        }while(praContinuar.equalsIgnoreCase("s")); // Leitura da resposta da validação

        media = soma / count; // Processamento da média
        System.out.printf("A média das notas inseridas foi de: %.2d" + media);
    }
}

