package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.TipoEntidad;
import pe.edu.upc.planwasi.repositories.ITipoEntidadRepository;
import pe.edu.upc.planwasi.serviceinterfaces.ITipoEntidadService;

import java.util.List;

@Service
public class TipoEntidadServiceImplement implements ITipoEntidadService {
    @Autowired
    private ITipoEntidadRepository teR;

    @Override
    public List<TipoEntidad> list() {
        return teR.findAll();
    }

    @Override
    public void insert(TipoEntidad te) {
        teR.save(te);
    }

    @Override
    public TipoEntidad findById(Long idte) {
        return teR.findById((Long) idte).orElse(new TipoEntidad());
    }

    @Override
    public void update(TipoEntidad te) {
        teR.save(te);
    }

    @Override
    public void delete(Long idte) {
        teR.deleteById((Long) idte);
    }
}
