package pe.edu.upeu.encapsulamiento;

public class ClaseGeneral {


    public static void probarJugador(){
        Jugador jugador =new Jugador();
        jugador.setNombre("pepe");
        jugador.setApellido("gutierrez");
        jugador.setEdad(24);
        jugador.setPosicion("delantero");
        jugador.setNumeroCam(9);
        System.out.println(jugador);
    }
    public static void probar(){
        Estudiante estudiante =new Estudiante();
        estudiante.setCarrera("ing. Sistemas ");
        estudiante.setCodigo("87664727");
        estudiante.trabajo();
    }
    public static void main(String[]args){
        Persona persona=new Persona();
        persona.setNombre("Pepe");
        persona.setEdad(19);
        persona.setGenero('M');

        persona.saludo();
        System.out.println("Genero: "+persona.getGenero());
        probar();
        probarJugador();
    }
}
