package pe.edu.upeu.asistncia.servicio;

import pe.edu.upeu.asistncia.modelo.Participante;

import java.util.List;

public interface ParticipanteServicioI {
    void save(Participante participante);//C
    List<Participante> findAll();//R
    Participante update(Participante participante, int index);//U
    void delete(int index);//D
    Participante findById(int index);//B

}
