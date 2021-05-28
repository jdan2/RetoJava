package co.com.sofka.reto.punto16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese Nombre");
        String nombre = in.nextLine();
        System.out.println("Ingrese Edad");
        int edad = in.nextInt();
        System.out.println("Ingrese Sexo");
        char sexo = in.next().charAt(0);
        System.out.println("Ingrese Peso");
        double peso = in.nextDouble();
        System.out.println("Ingrese Altura");
        double altura = in.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();


        persona3.setNombre("Daniel");
        persona3.setEdad(22);
        persona3.setSexo('M');
        persona3.setPeso(64);
        persona3.setAltura(1.79);


        System.out.println("***** Persona 1 ******");
        PesoIdeal(persona1);
        MayorDeEdad(persona1);
        System.out.println(persona1.toString());
        System.out.println("---------------------------------");

        System.out.println("***** Persona 2 ******");
        PesoIdeal(persona2);
        MayorDeEdad(persona2);
        System.out.println(persona2.toString());
        System.out.println("---------------------------------");

        System.out.println("***** Persona 3 ******");
        PesoIdeal(persona3);
        MayorDeEdad(persona3);
        System.out.println(persona3.toString());
        System.out.println("---------------------------------");

    }

    private static void MayorDeEdad(Persona persona1) {
        if(persona1.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
    }


    private static void PesoIdeal(Persona persona1) {
        if (persona1.calcularIMC() == -1) {
            System.out.println("Esta en su peso ideal");
        } else if (persona1.calcularIMC() == 0) {
            System.out.println("Esta por debajo de su pero ideal");
        } else if (persona1.calcularIMC() == 1) {
            System.out.println("Tiene sobre peso");

        }
    }
}
