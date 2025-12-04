package pe.edu.upc.planwasi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.planwasi.entities.EntidadFinanciera;

@Repository
public interface IEntidadFinancieraRepository extends JpaRepository<EntidadFinanciera, Integer> {
}
