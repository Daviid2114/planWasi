package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.PeriodoGracia;
import pe.edu.upc.planwasi.repositories.IPeriodoGraciaRepository;
import pe.edu.upc.planwasi.serviceinterfaces.IPeriodoGraciaService;

import java.util.List;

@Service
public class PeriodoGraciaServiceImplement implements IPeriodoGraciaService {
    @Autowired
    private IPeriodoGraciaRepository pgR;

    @Override
    public List<PeriodoGracia> list() {
        return pgR.findAll();
    }

    @Override
    public void insert(PeriodoGracia pg) {
        pgR.save(pg);
    }

    @Override
    public PeriodoGracia listId(int idpg) {
        return pgR.findById((int) idpg).orElse(new PeriodoGracia());
    }

    @Override
    public void update(PeriodoGracia pg) {
        pgR.save(pg);
    }

    @Override
    public void delete(int idpg) {
        pgR.deleteById((int) idpg);
    }
}
