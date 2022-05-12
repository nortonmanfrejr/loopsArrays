package arrays;


/**
 *
 *
 *
 * */

import java.util.Random;

public class ex4_matrizDimensional {
    /*
    * Gere e imprima uma Matriz m de 4x4 com valores aleatorios de 0-9
    *
    * */

   public static void main(String[] args){

       Random rd = new Random();
       int[][] M = new int[4][4];

       for(int i = 0; i < M.length; i++){
           for(int j = 0; j < M[i].length; j++){
               M[i][j] = rd.nextInt(9);
           }
       }

       System.out.println("Matriz: ");

       for(int[] linha : M){
           for(int coluna : linha){
               System.out.print(coluna + " "); // Impressão das colunas
           }
           System.out.println(); // Quebra de linha
       }

   }


}

