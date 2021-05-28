package co.com.sofka.reto.punto17;

public class Main {
    public static void main(String[] args) {

        Electrodomesticos electrodomesticos[] = new Electrodomesticos[10];

        electrodomesticos[0] = new Electrodomesticos(100,"Blanco",'B', 31);
        electrodomesticos[1] = new Electrodomesticos(100,50);
        electrodomesticos[2] = new Electrodomesticos();
        electrodomesticos[3] = new Lavadora(200,"Gris", 'D', 10, 40);
        electrodomesticos[4] = new Lavadora(200,30);
        electrodomesticos[5] = new Lavadora();
        electrodomesticos[6] = new Television(200,"Amarillo",'V',50,41,true);
        electrodomesticos[7] = new Television(200,50);
        electrodomesticos[8] = new Television();
        electrodomesticos[9] = new Television(100,"Azul",'E',60,20,true);


        SumaPrecios(electrodomesticos);

    }

    private static void SumaPrecios(Electrodomesticos[] electrodomesticos) {
        double precioElectrodomesticos = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;


        for(int i = 0; i< electrodomesticos.length; i++){


            if(electrodomesticos[i] instanceof Electrodomesticos  ){
                precioElectrodomesticos+=electrodomesticos[i].precioFinal();
            }
            if(electrodomesticos[i] instanceof Lavadora){
                precioLavadoras+=electrodomesticos[i].precioFinal();
            }
            if(electrodomesticos[i] instanceof Television){
                precioTelevisores+=electrodomesticos[i].precioFinal();
            }
        }

        System.out.println("Total precio electrodomesticos es de "+precioElectrodomesticos);
        System.out.println("Total precio las lavadoras es de "+precioLavadoras);
        System.out.println("Total precio los televisiones es de "+precioTelevisores );
    }
}
