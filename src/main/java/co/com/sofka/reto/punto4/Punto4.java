package co.com.sofka.reto.punto4;

import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese Precio");
        double precio  = in.nextDouble();
        final double iva = 0.21;

        precio = precio + precio * iva;

        System.out.println("El precio con iva es: " + precio);

    }
}
