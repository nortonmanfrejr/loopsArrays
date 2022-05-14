package listas_pyorg;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ex4_consoantesVetor {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<String> letras = new ArrayList<String>();
        List<String> consoantes = new ArrayList<String>();


        for(int i = 0; i < 10; i++){

            System.out.print((i + 1)+ "ºLetra --> ");
            String letra = sc.next();
            letras.add(letra);

            if(!letras.get(i).equalsIgnoreCase("a") && !letras.get(i).equalsIgnoreCase("e") &&
               !letras.get(i).equalsIgnoreCase("i") && !letras.get(i).equalsIgnoreCase("o") && !letras.get(i).equalsIgnoreCase("u")){
                consoantes.add(letra);
        }
        }

        System.out.println("Letras --> " + letras.toString());
        System.out.println("Consoantes --> " + consoantes.toString());
        System.out.println("Total de consoantes --> " + consoantes.size());

    }

}

//Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.