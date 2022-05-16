package listas_pyorg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ex15 {
    public static void main(String[] args){


        ArrayList<Double> valores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Digite um valor: ");
            double valor = sc.nextInt();

            if(valor == -1){
                break;
            } else {
                valores.add(valor);
            }

        }

        System.out.println("Quantidade de valores: " + valores.size()); // Quantidade de valores
        System.out.println("Valor: " + valores);



        // Valores embaixo do outro em ordem reversa
        Collections.reverse(valores);
        System.out.println("Valor: ");
        double somaValores = 0;
        for(Double valor : valores){
            somaValores += valor; // Calculando valores
            System.out.println(valor);
        }

        System.out.println("Soma dos valores: " + somaValores); // Soma dos valores
        System.out.println("Media dos valores: " + (somaValores / valores.size())); // Media dos valores


        int valorMaiorMedia = 0, valorAbaixo7 = 0;
        for(Double valor : valores){
            if(valor > (somaValores / valores.size())){
                valorMaiorMedia++;
            }

            if(valor < 7){
                valorAbaixo7++;
            }
        }

        System.out.println("Valores acima da media calculada: " + valorMaiorMedia);
        System.out.println("Valores abaixo de 7: " + valorAbaixo7);

    }
}

//
//    Faça um programa que leia um número indeterminado de valores, correspondentes a notas,
//    encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado).
//        Após esta entrada de dados, faça:
//
//
//        Mostre a quantidade de valores que foram lidos; x
//        Exiba todos os valores na ordem em que foram informados, um ao lado do outro; x
//        Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro; x
//        Calcule e mostre a soma dos valores; x
//        Calcule e mostre a média dos valores; x
//        Calcule e mostre a quantidade de valores acima da média calculada; x
//        Calcule e mostre a quantidade de valores abaixo de sete; x
//        Encerre o programa com uma mensagem; x
//
