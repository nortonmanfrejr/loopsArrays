package listas_pyorg;


import java.util.*;

public class ex20 {


    public static void main(String[] args){


        List<Double> salarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double porcentagem = 0.2, bonusMin = 100;

        boolean lerSalario = true;

        while(lerSalario){
            while(true){

                System.out.print("Salario: ");
                double salario = sc.nextDouble();
                if(salario == 0){
                    lerSalario = false;
                    break;
                } else if (salario > 0) {
                    salarios.add(salario);
                    break;
                } else {
                    System.out.println("Salario invalido!");
                }
            }

            /*Criando um map para ligar os salarios com seus respectivos bônus, respeitando a regra de no mínimo R$100 para salários
		abaixo de R$500.
		Usamos uma LinkedHashMap pois a ordem de inserção importa, como demostrado na impressão do exemplo, logo não precisamos
		ordenar.
		*/

            Map<Double, Double> salarioBonus = new LinkedHashMap<Double, Double>();



        }

    }


}
