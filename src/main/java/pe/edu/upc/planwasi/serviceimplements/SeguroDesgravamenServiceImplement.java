package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.SeguroDesgravamen;
import pe.edu.upc.planwasi.repositories.ISeguroDesgravamenRepository;
import pe.edu.upc.planwasi.serviceinterfaces.ISeguroDesgravamenService;

import java.util.List;

@Service
public class SeguroDesgravamenServiceImplement implements ISeguroDesgravamenService {
    @Autowired
    private ISeguroDesgravamenRepository sdR;
    @Override
    public List<SeguroDesgravamen> list() {
        return sdR.findAll();
    }

    @Override
    public void insert(SeguroDesgravamen sd) {
        sdR.save(sd);
    }

    @Override
    public SeguroDesgravamen listId(int idsd) {
        return sdR.findById((long) idsd).orElse(new SeguroDesgravamen());
    }

    @Override
    public void update(SeguroDesgravamen sd) {
        sdR.save(sd);
    }

    @Override
    public void delete(int idsd) {
        sdR.deleteById((long) idsd);
    }
}
