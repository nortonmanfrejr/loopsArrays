package arrays;


/**
 *
 *
 *
 *
 *
 * */

import java.util.Scanner;
public class ex2_consoantes {


    /*
    * Criar um programa que leia um vetor de 6 caracteres,
    * e diga quantas consoantes foram lidas.
    * Imprimir as consoantes
    * */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int qntdConsoantes = 0, count = 0;
        String[] consoantes = new String[6];

        do{
            System.out.print("Letra: ");
            String letra = sc.next();

            if( !(  letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")
                    )) {
                consoantes[count] = letra;
                qntdConsoantes++;

            } count++;

        }while(count < consoantes.length);

        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print("Consoantes: " + consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: " + qntdConsoantes);
        System.out.println(consoantes.length);
    }
}
