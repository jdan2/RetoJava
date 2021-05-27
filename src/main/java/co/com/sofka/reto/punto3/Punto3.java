package co.com.sofka.reto.punto3;

import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese radio del circulo");
        double redio  = in.nextDouble();

        double area = (Math.PI * Math.pow(redio,2));

        System.out.println("El area es " + area);

    }
}
