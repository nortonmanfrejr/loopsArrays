package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex33_temperatura {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count = 0;
        double menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, temp, soma = 0;

        System.out.println("Departamento Estadual de Meteorologia");
        System.out.println("Calculo de temperatura, para encerramento do sistema digite 00000.\n\n");

        while(true) {


            System.out.print((count + 1) + "º Temperatura --> ");
            temp = sc.nextDouble();


            // Encerramento programa
            if(temp == 00000){
                System.out.println("------ A media temperatura foi de " + (soma / count) + "ºG");
                System.out.println("------ A maior temperatura foi de " + maior + "ºG");
                System.out.println("------ A menor temperatura foi de " + menor + "ºG");
                break;
            }


            // Captura da menor temperatura
            if(temp < menor){
                menor = temp;
            }
            // Captura da maior temperatura
            if(temp > maior){
                maior = temp;
            }


            soma += temp;
            count++;
        }




    }


    /**
     * O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um
     * conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas,
     * bem como a média das temperaturas.
     * */
}
