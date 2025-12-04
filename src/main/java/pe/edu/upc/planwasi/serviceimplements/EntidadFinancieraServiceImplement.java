package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.EntidadFinanciera;
import pe.edu.upc.planwasi.repositories.IEntidadFinancieraRepository;
import pe.edu.upc.planwasi.serviceinterfaces.IEntidadFinancieraService;

import java.util.List;

@Service
public class EntidadFinancieraServiceImplement implements IEntidadFinancieraService {
    @Autowired
    private IEntidadFinancieraRepository repo;

    @Override
    public List<EntidadFinanciera> list() {
        return repo.findAll();
    }

    @Override
    public void insert(EntidadFinanciera entidad) {
        repo.save(entidad);
    }

    @Override
    public EntidadFinanciera findById(int id) {
        return repo.findById(id).orElse(new EntidadFinanciera());
    }

    @Override
    public void update(EntidadFinanciera entidad) {
        repo.save(entidad);
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
