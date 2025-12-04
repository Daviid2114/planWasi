package pe.edu.upc.planwasi.serviceinterfaces;

import pe.edu.upc.planwasi.entities.EntidadFinanciera;

import java.util.List;

public interface IEntidadFinancieraService {
    List<EntidadFinanciera> list();
    void insert(EntidadFinanciera entidad);
    EntidadFinanciera findById(int id);
    void update(EntidadFinanciera entidad);
    void delete(int id);
}
