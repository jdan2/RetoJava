package co.com.sofka.reto.punto18;

public class Main {

    public static void main(String[] args) {

        Serie series[] = new Serie[5];
        VideoJuego videoJuego[]  = new VideoJuego[5];

        series[0] = new Serie();
        series[1] = new Serie("Dark","Baran");
        series[2] = new Serie("Dark 2",3,"Misterio","Baran bo" );
        series[3] = new Serie("Flash",7,"Ciencia Ficcion","Gien" );
        series[4] = new Serie("Serie",5,"Drama","Kiensa" );

        videoJuego[0] = new VideoJuego();
        videoJuego[1] = new VideoJuego("Halo",15);
        videoJuego[2] = new VideoJuego("Halo 2",20,"Ciencia Ficcion","Microsoft");
        videoJuego[3] = new VideoJuego("Crash",18,"Aventura","Sony");
        videoJuego[4] = new VideoJuego("Trabajo",30,"Suspenso","Sofka");


        series[0].entregar();
        series[1].entregar();
        series[3].entregar();
        videoJuego[1].entregar();
        videoJuego[2].entregar();
        videoJuego[4].entregar();


        contarEntregados(series, videoJuego);
        VerMayor(series, videoJuego);
    }

    private static void VerMayor(Serie[] series, VideoJuego[] videoJuego) {
        Serie serieMayor = series[0];
        VideoJuego videoJuegoMayor = videoJuego[0];

        for(int i = 1; i< series.length; i++){
            if(series[i].compareTo(serieMayor)== 1){
                serieMayor= series[i];
            }
            if(videoJuego[i].compareTo(videoJuegoMayor) == 1){
                videoJuegoMayor= videoJuego[i];
            }

        }

        System.out.println("**** El video Juego mas largo es *****");
        System.out.println(videoJuegoMayor.toString());
        System.out.println("**** La serie mas largas es *****");
        System.out.println(serieMayor.toString());
    }

    private static void contarEntregados(Serie[] series, VideoJuego[] videoJuego) {
        int entregados=0;

        for(int i = 0; i< series.length; i++){
            if(series[i].isEntregado()){
                entregados+=1;
                series[i].devolver();

            }
            if(videoJuego[i].isEntregado()){
                entregados+=1;
                videoJuego[i].devolver();
            }
        }
        System.out.println("Se entregaron " + entregados + " series y video juegos");
    }
}
