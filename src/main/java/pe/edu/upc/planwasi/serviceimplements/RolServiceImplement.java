package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.Rol;
import pe.edu.upc.planwasi.repositories.IRolRepository;
import pe.edu.upc.planwasi.serviceinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rolR;

    @Override
    public List<Rol> list() {
        return rolR.findAll();
    }

    @Override
    public void insert(Rol rol) {
        rolR.save(rol);
    }

    @Override
    public void update(Rol rol) {
        rolR.save(rol);
    }

    @Override
    public void delete(int idRol) {
        rolR.deleteById(idRol);
    }

    @Override
    public Rol listId(int idRol) {
        return rolR.findById(idRol).get();
    }
}
