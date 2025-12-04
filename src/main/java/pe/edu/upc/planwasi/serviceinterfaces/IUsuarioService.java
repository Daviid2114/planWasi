package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario u);
    public Usuario listId(int idUsuario);
    public void update(Usuario u);
    public void delete(int idUsuario);
}
