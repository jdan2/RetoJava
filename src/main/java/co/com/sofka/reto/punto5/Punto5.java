package co.com.sofka.reto.punto5;

public class Punto5 {
    public static void main(String[] args) {

        int i = 1;
        while (i<101){

            if( i%2 == 0){
                System.out.println(i + " Es par");
            }else {
                System.out.println(i + " Es impar");
            }
            i++;
        }

    }
}
