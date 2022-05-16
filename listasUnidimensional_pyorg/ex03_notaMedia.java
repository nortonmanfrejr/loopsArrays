package listas_pyorg;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03_notaMedia {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> nota = new ArrayList<Double>();

        for(int i = 1; i <= 4; i++){
            System.out.println("Insira a nota: ");
            nota.add(sc.nextDouble());
        }

        double somaNota = 0;

        for(Double notas : nota){
            somaNota += notas;
        }

        System.out.println("Notas: " + nota.toString());
        System.out.println("Média: " + (somaNota / nota.size()));


    }
}
//
//    Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
