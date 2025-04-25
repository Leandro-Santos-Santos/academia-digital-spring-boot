package me.dio.academia.digital.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;;


public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
    // Aqui podemos adicionar métodos de consulta personalizados, se necessário
    // Exemplo: List<AvaliacaoFisica> findByAlunoId(Long alunoId);
}
