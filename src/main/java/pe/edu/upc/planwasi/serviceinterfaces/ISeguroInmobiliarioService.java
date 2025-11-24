package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.SeguroInmobiliario;

import java.util.List;

public interface ISeguroInmobiliarioService {
    public List<SeguroInmobiliario> list();
    public void insert(SeguroInmobiliario si);
    public SeguroInmobiliario listId(int idsi);
    public void update(SeguroInmobiliario si);
    public void delete(int idsi);
}
