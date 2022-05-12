package arrays;

public class ex1_ordemInversa {

    /*
    * Objetivo: Criar um vetor de 6 números e apresenta-los na ordem inversa
    * */

    public static void main(String[] args){

        int [] vetor = {-5, -6, 15, 50, 8, 4}; // Declarando o vetor
        int count = 0;


        System.out.println(vetor.length); // Tamanho do vetor
        System.out.println("Exercicio ordem Inversa, Vetores.");


        System.out.print("Vetor: ");
        while(count < (vetor.length)){

            System.out.print(vetor[count] + " "); // Ordem natural do vetor
            count++;
        }


        System.out.print("\nVetor: ");

        for(int i = (vetor.length - 1);i >= 0; i --)
            System.out.print(vetor[i] + " "); // Ordem inversa do vetor
    }
    /*
    * Anotação: A linha de codigo de processamento do vetor invertido estava dando um problema por conta
    * de que eu estava utilizando {} para identificar o que estava dentro da caixa de codigo, uma auto dica
    * para boas praticas é quando realizar alguma Condição ou Laços de Repetição que utilize somente
    * uma unica linha não colocar o codigo dentro dos {}
    * */
}
