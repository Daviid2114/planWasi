package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.SeguroInmobiliario;
import pe.edu.upc.planwasi.repositories.ISeguroInmobiliarioRepository;
import pe.edu.upc.planwasi.serviceinterfaces.ISeguroInmobiliarioService;

import java.util.List;

@Service
public class SeguroInmobiliarioServiceImplement implements ISeguroInmobiliarioService {
    @Autowired
    private ISeguroInmobiliarioRepository siR;
    @Override
    public List<SeguroInmobiliario> list() {
        return siR.findAll();
    }

    @Override
    public void insert(SeguroInmobiliario si) {
        siR.save(si);
    }

    @Override
    public SeguroInmobiliario listId(int idsi) {
        return siR.findById((long) idsi).orElse(new SeguroInmobiliario());
    }

    @Override
    public void update(SeguroInmobiliario si) {
        siR.save(si);
    }

    @Override
    public void delete(int idsi) {
        siR.deleteById((long) idsi);
    }
}
