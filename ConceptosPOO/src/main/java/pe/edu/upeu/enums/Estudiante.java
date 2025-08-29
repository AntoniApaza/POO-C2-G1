package pe.edu.upeu.enums;

enum GENERO{
    femenino, Masculino
}
public class Estudiante {
    String codigo;
    String nombre;
    String apellido;
    GENERO genero;
    Carrera carrera;

    public Estudiante(String codigo, String nombre, String apellido, GENERO genero,Carrera carrera){
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.carrera=carrera;
    }
    public static void main(String[]args){
        Estudiante e=new Estudiante("76545676","juanito","quispe",GENERO.Masculino,Carrera.Sistemas);
        System.out.println(e.codigo+" "+e.nombre+" " +e.apellido+" "+e.genero+" "+e.carrera);
        for(Carrera c: Carrera.values()){
            System.out.println(c);
        }
    }
}