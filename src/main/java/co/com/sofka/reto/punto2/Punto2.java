package co.com.sofka.reto.punto2;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1  = in.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2  = in.nextInt();

        if(num1 > num2){
            System.out.println("Priner numero es mayor");
        }else if (num1 < num2){
            System.out.println("Segundo numero es mayor");
        }else{
            System.out.println("Los numeros son iguales");
        }

    }
}
