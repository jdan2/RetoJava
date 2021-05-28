package co.com.sofka.reto.punto11;

import java.util.Scanner;

public class Punto11 {
    public static void main(String[] args) {
        System.out.println("Ingrese Frase");
        Scanner in = new Scanner(System.in);
        String frase = in.nextLine();

        int a = 0; int e = 0; int i = 0; int o = 0; int u = 0;


                for(int j = 0; j < frase.length(); j++){
                    switch (frase.charAt(j)){
                        case 'a' : a++;break;
                        case 'e' : e++;break;
                        case 'i' : i++;break;
                        case 'o' : o++;break;
                        case 'u' : u++;break;

                    }
                }

        System.out.println( "La frase tiene una longitud de " +frase.length()+
                "\n"+ "A: "+a + "\n"+ "E: "+e + "\n"+"I: "+i + "\n"+"O: "+o + "\n"+"U: "+u + "\n");
    }
}
