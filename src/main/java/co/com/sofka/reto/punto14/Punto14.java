package co.com.sofka.reto.punto14;

import java.util.Scanner;

public class Punto14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num = in.nextInt();

        for(int i = num; i < 1000; i = i+2){
            num = num + 2;
            if(num <= 1000){
                System.out.println(num);
            }
        }

    }
}
