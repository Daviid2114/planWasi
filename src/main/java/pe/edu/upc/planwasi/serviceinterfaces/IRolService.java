package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol rol);
    public void update(Rol rol);
    public void delete(int idRol);
    public Rol listId(int idRol);
}
