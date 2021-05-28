package co.com.sofka.reto.punto17;

import java.util.Hashtable;

public class Electrodomesticos {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected final static String colorDefecto = "Blanco";
    protected final static char consumoEnergeticoDefecto = 'F';
    protected final static double precioBaseDefecto = 100;
    protected final static double pesoDefecto = 5;


    public Electrodomesticos() {
        this.precioBase = precioBaseDefecto;
        this.peso = pesoDefecto;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
    }

    public Electrodomesticos(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
    }

    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(color);
    }

    public  void comprobarConsumoEnergetico(char letra){
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=consumoEnergeticoDefecto;
        }
    }

    public void comprobarColor(String color){
        String colores[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        for (int i = 0; i < colores.length ; i++ ){
            if(colores[i].equalsIgnoreCase(color)){
                this.color = color;
                break;
            }else{
                this.color = colorDefecto;
            }

        }
    }

    public double precioFinal(){
        Hashtable precioLetra = getHashtable();
        this.precioBase = (int) precioLetra.get(this.consumoEnergetico) + precioPeso(this.peso);
        return this.precioBase;
    }

    private double precioPeso(double peso) {
        double precioPe = 0;
        if(peso>=0 && peso<19){
            precioPe = 10;
        }else if(peso>=20 && peso<49){
            precioPe = 50;
        }else if(peso>=50 && peso<=79){
            precioPe = 80;
        }else if(peso>=80){
            precioPe = 100;
        }
        return precioPe;
    }

    private Hashtable getHashtable() {
        Hashtable precioLetra=new Hashtable();
        precioLetra.put('A', 100);
        precioLetra.put('B', 80);
        precioLetra.put('C', 60);
        precioLetra.put('D', 50);
        precioLetra.put('E', 30);
        precioLetra.put('F', 10);
        return precioLetra;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
}
