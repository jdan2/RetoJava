package co.com.sofka.reto.punto10;

import java.util.Scanner;

public class Punto10 {
    public static void main(String[] args) {
        System.out.println("Ingrese frese");
        Scanner in = new Scanner(System.in);
        String frase = in.nextLine();
        frase = frase.replace(" ","");
        System.out.println(frase);


    }
}
