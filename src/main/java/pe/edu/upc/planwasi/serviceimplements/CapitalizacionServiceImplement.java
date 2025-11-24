package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.Capitalizacion;
import pe.edu.upc.planwasi.repositories.ICapitalizacionRepository;
import pe.edu.upc.planwasi.serviceinterfaces.ICapitalizacionService;

import java.util.List;

@Service
public class CapitalizacionServiceImplement implements ICapitalizacionService {
    @Autowired
    private ICapitalizacionRepository cpR;

    @Override
    public List<Capitalizacion> list() {
        return cpR.findAll();
    }

    @Override
    public void insert(Capitalizacion cp) {
        cpR.save(cp);
    }

    @Override
    public Capitalizacion listId(int idcp) {
        return cpR.findById((int) idcp).orElse(new Capitalizacion());
    }

    @Override
    public void update(Capitalizacion cp) {
        cpR.save(cp);
    }

    @Override
    public void delete(int idcp) {
        cpR.deleteById((int) idcp);
    }
}
