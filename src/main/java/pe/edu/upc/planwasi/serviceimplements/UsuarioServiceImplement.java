package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.Usuario;
import pe.edu.upc.planwasi.repositories.IUsuarioRepository;
import pe.edu.upc.planwasi.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Usuario u) {
        uR.save(u);
    }

    @Override
    public Usuario listId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }



    @Override
    public void update(Usuario u) {
        uR.save(u);
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }



}

