package pe.edu.upc.planwasi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import pe.edu.upc.planwasi.entities.TipoUsuario;


@Repository
public interface ITipoUsuarioRepository extends JpaRepository<TipoUsuario,Integer> {


}
