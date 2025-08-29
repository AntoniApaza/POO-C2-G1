package pe.edu.upeu.asistncia.servicio;

import pe.edu.upeu.asistncia.modelo.Estudiante;

import java.util.List;

public interface EstudianteServicioI {
    void save(Estudiante estudiante);//C
    List<Estudiante> findAll();//R
    Estudiante update(Estudiante estudiante, int index);//U
    void delete(int index);//D
    Estudiante findById(int index);//B

}
