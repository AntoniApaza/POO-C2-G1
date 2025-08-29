package pe.edu.upeu.encapsulamiento;


public class Estudiante {

    private String carrera;
    private String codigo;

    public void trabajo(){
        System.out.println("esrudiar, investigar "+"en la carrera de: "+getcarrera()+"codigo de Estudiante: "+getCodigo());
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo =codigo;
    }
    public String getcarrera (){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
}