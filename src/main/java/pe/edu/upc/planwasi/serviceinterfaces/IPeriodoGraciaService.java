package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.PeriodoGracia;

import java.util.List;

public interface IPeriodoGraciaService {
    public List<PeriodoGracia> list();
    public void insert(PeriodoGracia pg);
    public PeriodoGracia listId(int idpg);
    public void update(PeriodoGracia pg);
    public void delete(int idpg);
}
