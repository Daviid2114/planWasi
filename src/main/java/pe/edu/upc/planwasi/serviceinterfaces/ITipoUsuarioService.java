package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.TipoUsuario;

import java.util.List;

public interface ITipoUsuarioService {
    public List<TipoUsuario> list();

    public void insert(TipoUsuario tpus);

    public TipoUsuario listId(int idTipoUsuario);
    public void update(TipoUsuario tpus);
    public void delete(int idtipoUsuario);


}
