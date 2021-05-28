package co.com.sofka.reto.punto17;

public class Television extends  Electrodomesticos{
    private final static double resolucionDefecto = 20;
    private final static boolean sintonixadorTdtDefecto = false;

    private double resolucion;
    private boolean sintonixadorTdt;

    public Television() {
        this.resolucion = resolucionDefecto;
        this.sintonixadorTdt = sintonixadorTdtDefecto;
        this.precioBase = precioBaseDefecto;
        this.peso = pesoDefecto;
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.color = colorDefecto;
        this.consumoEnergetico = consumoEnergeticoDefecto;
        this.resolucion = resolucionDefecto;
        this.sintonixadorTdt = sintonixadorTdtDefecto;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonixadorTdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonixadorTdt = sintonixadorTdt;
    }

    @Override
    public double precioFinal() {
        this.precioBase = super.precioFinal();
        precioResolucion();
        precioSintonizador();

        return  this.precioBase;
    }

    private void precioSintonizador() {
        if(sintonixadorTdt){
            this.precioBase = this.precioBase + 50;
        }
    }

    private void precioResolucion() {
        if(this.resolucion > 40){
            this.precioBase = this.precioBase + (this.precioBase*0.3);
        }
    }


    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonixadorTdt() {
        return sintonixadorTdt;
    }
}
