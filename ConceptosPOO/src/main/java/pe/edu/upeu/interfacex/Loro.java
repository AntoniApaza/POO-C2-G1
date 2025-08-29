package pe.edu.upeu.interfacex;

public class Loro implements Animal{
    @Override
    public void emitirSonido() {
        System.out.println("Hola manito...aprendé pues");
    }
    @Override
    public void dormir() {
        System.out.println("Zzz...Zzz....");
    }
}

