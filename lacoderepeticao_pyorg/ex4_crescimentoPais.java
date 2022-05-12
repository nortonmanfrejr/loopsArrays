package lacoderepeticao_pyorg;

public class ex4_crescimentoPais {
    /**
     * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma
     * taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma
     * taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
     *para que a população do país A ultrapasse ou iguale a população do país B,
     * mantidas as taxas de crescimento.
     * */
    public static void main(String[] args){

        double habitantesA = 80000, habitantesB = 200000; // Habitantes
        double rateA = (1 - 0.03), rateB = (1 + 0.015); // Taxa de crescimento
        double count = 0;

        do {
            habitantesA *= rateA;
            habitantesB *= rateB;
            count++;

        }while(habitantesA < habitantesB);

       System.out.println("Habitantes A:" + habitantesA);
       System.out.println("Habitantes B:" + habitantesB);
       System.out.print("Os habitantesA se tornaram igual ou maior aos habitantesB em " + count + " anos.");

    }

}


