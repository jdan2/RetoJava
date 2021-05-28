package co.com.sofka.reto.punto16;

import java.awt.datatransfer.StringSelection;

public class Persona {

    private final static char sexoDefecto = 'H';
    private String nombre;
    private int edad ;
    private String dni;
    private char sexo ;
    private double peso ;
    private double altura ;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
        this.sexo = sexoDefecto;
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        generarDNI();
        comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
        comprobarSexo(sexo);
    }

    public int calcularIMC(){
        double calculo = this.peso/(Math.pow(this.altura, 2));
        int resultado = 0;
       if(calculo < 20) {
           resultado =  -1;
       }else if(calculo >= 20 && 25 <= calculo){
           resultado = 0;
       }else if(calculo > 25){
           resultado = 1;
       }
        return resultado;
    }

    public boolean esMayorDeEdad(){
       if(this.edad >= 18){
           return true;
       }
       return false;
    }

    public void comprobarSexo(char sexo){
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void generarDNI(){

        int numDni = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDni % 23;
        char letraDNI = generaLetra(res);
        this.dni = Integer.toString(numDni) + letraDNI;
    }

    private char generaLetra(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
