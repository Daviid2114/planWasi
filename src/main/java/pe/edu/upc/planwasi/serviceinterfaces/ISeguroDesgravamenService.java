package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.SeguroDesgravamen;

import java.util.List;

public interface ISeguroDesgravamenService {
    public List<SeguroDesgravamen> list();
    public void insert(SeguroDesgravamen sd);
    public SeguroDesgravamen listId(int idsd);
    public void update(SeguroDesgravamen sd);
    public void delete(int idsd);
}
