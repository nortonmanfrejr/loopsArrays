package exercicios.listasUnidimensional_pyorg;

import java.util.ArrayList;
import java.util.Scanner;

public class ex11_e10mescla3arrays {

    public static void main(String[] args){


        ArrayList<Integer> vetorA = new ArrayList<Integer>();
        ArrayList<Integer> vetorB = new ArrayList<Integer>();
        ArrayList<Integer> vetorAB = new ArrayList<Integer>();
        ArrayList<Integer> vetorABAB = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < 10; i++){
            System.out.print(i + "ª Vetor A --> ");
            vetorA.add(sc.nextInt());
        }

        for(int j = 0; j < 10; j++) {
            System.out.print(j + "ª Vetor B --> ");
            vetorB.add(sc.nextInt());
        }
        // Mesclando vetores A e B para formar o vetor AB
        vetorAB.addAll(vetorA); vetorAB.addAll(vetorB);
        // Mesclando vetores A, B e AB para formar o vetor ABAB
        vetorABAB.addAll(vetorA); vetorABAB.addAll(vetorB); vetorABAB.addAll(vetorAB);

        System.out.println("Vetor A:  " + vetorA);
        System.out.println("Vetor B:  " + vetorB);
        System.out.println("Vetor C:  " + vetorAB);
        System.out.println("Vetor D: " + vetorABAB);
    }
}

//
//    Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.