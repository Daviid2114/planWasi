package pe.edu.upc.planwasi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.planwasi.entities.TipoUsuario;
import pe.edu.upc.planwasi.repositories.ITipoUsuarioRepository;
import pe.edu.upc.planwasi.serviceinterfaces.ITipoUsuarioService;

import java.util.List;

@Service
public class TipoUsuarioServiceImplement implements ITipoUsuarioService {

    @Autowired
    private ITipoUsuarioRepository tpuR;

    @Override
    public List<TipoUsuario> list() {return tpuR.findAll();}

    @Override
    public void insert(TipoUsuario tu) {tpuR.save(tu);}

    @Override
    public TipoUsuario listId(int idTipoUsuario) {return tpuR.findById(idTipoUsuario).orElse(new TipoUsuario());}

    @Override
    public void update(TipoUsuario tu) { tpuR.save(tu);}

    @Override
    public void delete(int idtipoUsuario) {
        tpuR.deleteById(idtipoUsuario);
    }


}
