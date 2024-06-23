package hospital.com.repositories;

import hospital.com.entities.HistoricoInternacoesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricoInternacoesRepository extends JpaRepository<HistoricoInternacoesEntity, Long> {

    List<HistoricoInternacoesEntity> findByDescricao(String descricao);
}
