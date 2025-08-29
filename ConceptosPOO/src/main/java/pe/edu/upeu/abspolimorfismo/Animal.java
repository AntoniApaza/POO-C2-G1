package pe.edu.upeu.abspolimorfismo;

abstract class Animal {
    protected String tipo="gaa";
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}
