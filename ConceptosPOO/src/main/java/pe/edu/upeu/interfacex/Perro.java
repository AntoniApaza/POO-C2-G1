package pe.edu.upeu.interfacex;

public class Perro implements  Animal{

    @Override
    public void emitirSonido() {
        System.out.println("guau.....guau");
    }
    @Override
    public void dormir() {
        System.out.println("Zzz...Zzz...");

    }
}
