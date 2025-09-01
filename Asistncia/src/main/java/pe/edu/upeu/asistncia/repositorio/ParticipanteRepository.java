package pe.edu.upeu.asistncia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistncia.enums.Carrera;
import pe.edu.upeu.asistncia.enums.TipoParticipante;
import pe.edu.upeu.asistncia.modelo.Participante;

import java.util.ArrayList;
import java.util.List;

public abstract class ParticipanteRepository {
    protected List<Participante> participantes = new ArrayList<>();

    public List<Participante> findAll() {
    participantes.add(new Participante(
            new SimpleStringProperty("76478932"),
            new SimpleStringProperty("pepe"),
            new SimpleStringProperty("quispe"),
            Carrera.SISTEMAS,
            TipoParticipante.ASISTENTE,
            new SimpleBooleanProperty(true)));
    return participantes;
    }
}
