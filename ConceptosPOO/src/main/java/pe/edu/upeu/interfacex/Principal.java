package pe.edu.upeu.interfacex;

public class Principal {
    public static void main(String[] args) {
        Animal dd=new Loro();
        Animal bb=new Perro();
        dd.emitirSonido();
        dd.dormir();
        bb.emitirSonido();
        bb.dormir();
    }
}

