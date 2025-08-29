package pe.edu.upeu.asistncia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistncia.modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudianteRepository {
    protected List<Estudiante> estudiantes = new ArrayList<>();

    public List<Estudiante> findAll() {
    estudiantes.add(new Estudiante(
            new SimpleStringProperty("pepe"),
            new SimpleBooleanProperty(true)));
    return estudiantes;
    }
}
