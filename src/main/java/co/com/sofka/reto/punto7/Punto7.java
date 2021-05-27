package co.com.sofka.reto.punto7;

import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Ingrese Numero");
            opcion  = in.nextInt();

            if(opcion >= 0){
                System.out.println("El numero es mayo o igual a cero");
            }

        } while (opcion < 0);

    }
}
