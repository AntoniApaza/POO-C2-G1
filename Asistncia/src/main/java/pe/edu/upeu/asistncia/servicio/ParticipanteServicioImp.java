package pe.edu.upeu.asistncia.servicio;

import org.springframework.stereotype.Service;
import pe.edu.upeu.asistncia.modelo.Participante;
import pe.edu.upeu.asistncia.repositorio.ParticipanteRepository;
import java.util.List;

@Service
public class ParticipanteServicioImp extends ParticipanteRepository
implements ParticipanteServicioI {

    @Override
    public void save(Participante participante) {
        super.save(participante);
    }
    @Override
    public Participante update(Participante participante) {
        return super.update(participante);
    }
    @Override
    public void delete(String dni) {
        super.delete(dni);
    }
    @Override
    public Participante findById(int index) {
        return participantes.get(index);
    }

    @Override
    public List<Participante> findAll(){
        return super.findAll();
    }
}

