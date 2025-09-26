package pe.edu.upeu.asistncia.modelo;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upeu.asistncia.enums.Carrera;
import pe.edu.upeu.asistncia.enums.TipoParticipante;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Participante {
    private StringProperty Dni;
    private StringProperty Nombre;
    private StringProperty Apellido;
    private Carrera Carrera;
    private TipoParticipante TipoParticipante;
    private BooleanProperty Estado;
}
