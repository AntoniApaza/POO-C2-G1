package pe.edu.upeu.abspolimorfismo;

public class Loro extends Animal{

    private String tipo="ave";

    @Override
    public void animalSound() {
        System.out.println("Hola manito");
    }
    public void sleep() {
        super.sleep();
        System.out.println(super.tipo);
        System.out.println(this.tipo);
        System.out.println("Estoy durmiendo");
    }
}