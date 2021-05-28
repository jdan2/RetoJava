package co.com.sofka.reto.punto15;


import java.util.Scanner;

public class Punto15 {

    public static void main(String[] args) {

        int opcion = menu();
        while (opcion != 8){
             opcion = menu();
            switch (opcion) {
                case 1:
                    menu();
                    break;
                case 8:
                    opcion = 8;
                    break;

                default:
                    System.out.println("OPCION INCORRECTO");
            }
        }


    }

    private static int menu() {
        System.out.println("****** GESTION CINEMATOGRÁFICA *******");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6-VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICAS DE LOS ACTORES");
        System.out.println("8-SALIR");

        Scanner in = new Scanner(System.in);
        int opcion = in.nextInt();

        if(opcion >= 1  && opcion <=7){
            opcion = 1;
        }

        return opcion;

    }


}

