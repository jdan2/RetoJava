package co.com.sofka.reto.punto17;

public class Lavadora extends Electrodomesticos{
    private final static double cargaDefecto = 5;

    private double carga;

    public Lavadora() {
        this.precioBase = precioBaseDefecto;
        this.peso = pesoDefecto;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.carga = cargaDefecto;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.carga = cargaDefecto;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        this.precioBase = super.precioFinal();
        if(this.carga > 30){
            this.precioBase = this.precioBase + 50;
        }

        return precioBase;
    }



    public double getCarga() {
        return carga;
    }
}
