package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.Rol;
import pe.edu.upc.planwasi.serviceinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolService rolR;

    @Override
    public List<Rol> list() {
        return rolR.findAll();
    }

    @Override
    public void insert(Rol rol) {

    }

    @Override
    public void update(Rol rol) {

    }

    @Override
    public void delete(Long idRol) {

    }

    @Override
    public Rol findById(Long idRol) {
        return null;
    }
}
