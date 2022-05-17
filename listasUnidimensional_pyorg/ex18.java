package listas_pyorg;

import jdk.jfr.Percentage;

import java.util.*;

public class ex18 {

    public Double porcentagem(double numbVotePlayer, double totalVote){
        return (numbVotePlayer * 100) / totalVote;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Adicionar elementos repetidos. -- Use ArrayList
        List<Integer> votos = new ArrayList<>();
        boolean toVote = true;

        while(toVote){
            while(true){

                System.out.print("Qual o melhor jogador? (0 = End)");
                int voto = sc.nextInt();
                if(voto == 0){
                    toVote = false;
                    break;
                } else if (voto >= 1 || voto <= 23){
                    votos.add(voto);
                    break;
                } else {
                    System.out.println("Entre com um valor de 1 a 23 ou 0 para encerrar: ");

                }
            }
        }

        System.out.println("Resultado dos votos: \n" + votos.size() + " votos foram contados.");

        // Criar um map para fazer a contagem de elementos repetidos.
        Map<Integer, Integer> playerToVote = new HashMap<Integer, Integer>();

        // Para cada elemento da array votos. Faça
        for(Integer voto : votos){
            if(playerToVote.containsKey(voto)){ // Se existe
                // Criar uma variavel para armazenar o total de vezes que o valor se repete.
                Integer n = playerToVote.get(voto);
                //Coloque no map a chave (voto) e a quantidade de vezes que aparece +1, de acordo com a posição chave no ArrayList (votos)
                playerToVote.put(voto, n + 1);
            } else{ // Se o valor voto ainda não esta dentro do map (playerToVote), faça.
                /*coloque no map a chave (votes) e a quantidade de vezes será 1, pois é a primeira vez que ele aparece,
				nas demais vezes, essa chave entrará no if acima.*/
                playerToVote.put(voto,1);
            }
        }

        /*Agora, precisamos colocar em ordem. O exercício pediu para imprimir na ordem das chaves (1 a 23).
		 Vamos criar um TreeSet que contém elementos do tipo map e para organizar esses elementos dentro do TreeSet,
		 precisamos obrigatoriamente passar no seu construturor como será organizado esses elementos através da interface
		 Comparator.
		 */

        Set<Map.Entry<Integer, Integer>> orderPlayerVote = new TreeSet<Map.Entry<Integer, Integer>>(
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                }
        );

        /*Requisito de ordem já feito, vamos adicionar todos os elementos do map playerToVote dentro do TreeSet orderPlayerToVote.
		 Já que existe a organização foi feita, a medida que o elemento do playerToVote for adicionado no orderPlayerToVote será respeitada
		 a ordem.
		 */

        orderPlayerVote.addAll(playerToVote.entrySet());

        String tex1 = "Jogador";
        String tex2 = "Votos";
        String tex3 = "%";
        System.out.printf("%s%9s%8s", tex1, tex2, tex3);

        ex18 e = new ex18();

        int maiorValor = Integer.MIN_VALUE, maiorChave = 0;

        for(Map.Entry<Integer, Integer> entry : orderPlayerVote){
            if(maiorValor < entry.getValue()){
                maiorValor = entry.getValue();
                maiorChave = entry.getKey();
            }

            System.out.printf("%3d %9d %8.2f%s", entry.getKey(), entry.getValue(), e.porcentagem(entry.getValue(), votos.size()), tex3);
        }
        System.out.printf("O melhor jogador é o numero %d com %d votos, correspondendo a %.2f%s do total dos votos.\n", maiorChave, maiorValor, e.porcentagem(maiorValor, votos.size()), tex3);
    }

}

