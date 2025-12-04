package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.TipoEntidad;

import java.util.List;

public interface ITipoEntidadService {
    public List<TipoEntidad> list();
    public void insert(TipoEntidad te);
    public TipoEntidad findById(Long idte);
    public void update(TipoEntidad te);
    public void delete(Long idte);
}
