package exercicios.listasUnidimensional_pyorg;

import java.util.Scanner;
import java.util.ArrayList;
;
public class ex12 {
    public static void main(String[] args) {

        ArrayList<Double> altura13Anos = new ArrayList<Double>();
        double somaAltura = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 30; i++){

            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            if(idade > 13){
                altura13Anos.add(altura);
            }
        }

        double medialAltura = somaAltura / 30;


        int count = 0;

        for(Double altura : altura13Anos){
            if(altura > medialAltura){
                count++;
            }
        }

        System.out.println(medialAltura);
        System.out.println(count);
    }
}

//    Foram anotadas as idades e alturas de 30 alunos.
//        Faça um Programa que determine quantos alunos com mais de 13 anos
//        possuem altura inferior à média de altura desses alunos.

