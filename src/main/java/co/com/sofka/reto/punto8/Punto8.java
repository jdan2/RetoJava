package co.com.sofka.reto.punto8;

import java.util.Scanner;

public class Punto8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        String dia =  in.nextLine();

        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }

    }

