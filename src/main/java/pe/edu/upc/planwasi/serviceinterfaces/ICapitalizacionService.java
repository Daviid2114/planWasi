package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.Capitalizacion;

import java.util.List;

public interface ICapitalizacionService {
    public List<Capitalizacion> list();
    public void insert(Capitalizacion cp);
    public Capitalizacion listId(int idcp);
    public void update(Capitalizacion cp);
    public void delete(int idcp);
}
