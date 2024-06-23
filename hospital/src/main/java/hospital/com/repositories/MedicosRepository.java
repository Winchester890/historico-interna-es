package hospital.com.repositories;

import hospital.com.entities.MedicosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicosRepository extends JpaRepository<MedicosEntity, Long> {

    List<MedicosEntity> findByNome(String nome);
}
