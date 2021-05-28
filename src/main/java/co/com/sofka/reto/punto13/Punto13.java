package co.com.sofka.reto.punto13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Punto13 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Hora y fecha: "+hourdateFormat.format(date));
    }
}
