package lacoderepeticao_pyorg;

import java.util.Scanner;

public class ex06_impressaoAbaixoLado {

    /**
     * Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
     * Depois modifique o programa para que ele mostre os números um ao lado do outro.
     * */
    public static void main(String[] args){

        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Você deseja ver a apresentação Embaixo [E] ou Lado a Lado [L]: ");
        String modo = sc.next();

        while(count < 20 && modo.equalsIgnoreCase("e")){
            count++;
            System.out.println(count);
        }

        while(count < 19 && modo.equalsIgnoreCase("l")){
            count++;
            System.out.print(count + " ");
        }

    }

    /**

     Resolução do exercicio proposto realizado com for

     for (int i = 1; i <= 20; i++) {
     System.out.println(i);
     }

     for (int i = 1; i <= 20; i++) {
     System.out.print(i + " ");
     }


     link

     https://github.com/cami-la/listaDeExerciciosPythonBrasil/blob/master/estruturaDeRepeticao/estruturaDeRepeticaoExercise006.java
     * */
}
