package co.com.sofka.reto.punto12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Punto12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese primera palabra");
        String palabra1 = in.nextLine();
        System.out.println("Ingrese segunda palabra");
        String palabra2 = in.nextLine();

        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son diferentes");
            List<Character> diferencias2 = new ArrayList<>();
            List<Character> diferencias1 = new ArrayList<>();
            int longitud = mayor(palabra1, palabra2);

            lista(palabra1, palabra2, diferencias2, diferencias1, longitud);

            if (palabra1.length() < palabra2.length()) {
                for (int x = longitud; x < palabra2.length(); x++) {
                    char letra2 = palabra2.charAt(x);
                    diferencias1.add(letra2);
                }
            } else if (palabra1.length() > palabra2.length()) {
                for (int x = longitud; x < palabra1.length(); x++) {
                    char letra1 = palabra1.charAt(x);
                    diferencias2.add(letra1);
                }
            }
            System.out.println("Las diferencias son " + diferencias2);
            System.out.println("Las diferencias son " + diferencias1);
        }
    }

    private static void lista(String palabra1, String palabra2, List<Character> diferencias1, List<Character> diferencias2, int longi) {
        for (int x = 0; x < longi; x++) {
            char letra1 = palabra1.charAt(x);
            char letra2 = palabra2.charAt(x);
            if (letra1 != letra2) {
                diferencias1.add(letra1);
                diferencias2.add(letra2);
            }
        }
    }

    public static int mayor(String palabra1, String palabra2) {
        int tamano = 0;

        if (palabra1.length() < palabra2.length()) {
            tamano = palabra1.length();
        } else {
            tamano = palabra2.length();
        }

        return tamano;
    }
}