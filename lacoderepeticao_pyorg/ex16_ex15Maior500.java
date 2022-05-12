package lacoderepeticao_pyorg;

public class ex16_ex15Maior500 {

    public static void main(String[] args){

        int fb1 = 0, fb2 = 1, fb3 = 0;

        System.out.print(fb1 + " " + fb2 + " ");

        do{

            fb3 = fb1 + fb2;
            fb1 = fb2;
            fb2 = fb3;

            System.out.print(fb3 + " ");

        }while(fb3 < 500);
    }
}
