package pe.edu.upeu.herencia;

public class Carro extends Vehiculo{
    String modelo="Mustang";
    String placa="6A6Z56";
    String color="Negro";

    void caracteristicas(){
        System.out.println("Las caracteristicas e este carro son:");
        System.out.println("Modelo"+modelo);
        System.out.println("Marca"+marca);//atributo heredado
        System.out.println("Placa"+placa);
        System.out.println("Negro"+color);

    }
    public static void main(String[]args){
        Carro carro =new Carro();
        carro.caracteristicas();
        carro.sonido();//metodo heredadox
    }
}
