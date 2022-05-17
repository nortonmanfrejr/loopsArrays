package listas_pyorg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class ex19 {

    public Double porcetagem(double numberVote, double totalVote) {
        return (numberVote * 100) / totalVote;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> votes = new ArrayList<>();
        boolean toVote = true;


        while (toVote) {
            while (true) {
                System.out.print("Enquente: Qual o melhor sistema operacional? (0 = End)");
                int vote = sc.nextInt();
                if (vote == 0) {
                    toVote = false;
                    break;
                } else if (vote >= 1 || vote <= 6) {
                    votes.add(vote);
                    break;
                } else {
                    System.out.println("Insira um valor valido...\nQual o melhor sistema operacional? (0 = End)");
                }
            }
        }
        // ------------------------

        System.out.println("Resultado de votos: \n" + votes.size() + " Foram contados.");
        // Criar map para a contagem de elementos repetidos

        Map<Integer, Integer> soVotes = new HashMap<Integer, Integer>();

        for (Integer vote : votes) {
            if (soVotes.containsKey(vote)) {
                Integer n = soVotes.get(vote); // Variavel para armazenamento do contador de numeros repetidos
                soVotes.put(vote, n + 1); // Mapa chave do voto e a quantidade de vezes que aparece +1, de acordo com a posição da chave no ArrayList
            } else {
                soVotes.put(vote, 1); // coloque no map a chave (votes) e a quantidade de vezes será 1, pois é a primeira vez que ele aparece, nas demais vezes, essa chave entrará no if acima.
            }
        }

        // --------------------------

        /*Agora, precisamos colocar em ordem. O exercício pediu para imprimir na ordem das chaves (1 a 23).
		 Vamos criar um TreeSet que contém elementos do tipo map e para organizar esses elementos dentro do TreeSet,
		 precisamos obrigatoriamente passar no seu construtor como será organizado esses elementos através da interface
		 Comparator.
		 */

        Set<Map.Entry<Integer, Integer>> soVoteOrder = new TreeSet<Map.Entry<Integer, Integer>>(
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                }
        );

        //Vamos adicionar todos os elementos de numberToVote dentro do TreeSet, ele já vai inserir na ordem que definimos acima

        soVoteOrder.addAll(soVotes.entrySet());

        Map<String, Integer> soToVotes = new LinkedHashMap<String, Integer>();

        System.out.println(soToVotes);


        for (Map.Entry<Integer, Integer> entry : soVoteOrder) {
            if (entry.getKey() == 1) {
                soToVotes.put("Windows Server", entry.getValue());
            } else if (entry.getKey() == 2) {
                soToVotes.put("Unix", entry.getValue());
            } else if (entry.getKey() == 3) {
                soToVotes.put("Linux", entry.getValue());
            } else if (entry.getKey() == 4) {
                soToVotes.put("Netware", entry.getValue());
            } else if (entry.getKey() == 5) {
                soToVotes.put("MacOS", entry.getValue());
            } else {
                soToVotes.put("Outros", entry.getValue());
            }
        }

        ex19 e = new ex19();

        String tex1 = "Operational System";
        String tex2 = "Votes";
        String tex3 = "%";
        System.out.printf("\n%s%9s%7s", tex1, tex2, tex3);
        System.out.println("\n-------------------   -----     ---");


        /*Para finalizar vamos imprir. Vamos imprir. Como queremos cada ítem separadamente, vamos usar o entry.Set() que permite pegar cada ítem
		 (chave e valor) e manipular separadamente.
		 */

        int sumVotes = 0, maiorValor = Integer.MIN_VALUE;
        String maiorChave = "";

        for (Map.Entry<String, Integer> entry : soToVotes.entrySet()) {
            if(maiorValor < entry.getValue()){
                maiorChave = entry.getKey();
                maiorValor = entry.getValue();
            }
            sumVotes += entry.getValue();
        }
    }
}