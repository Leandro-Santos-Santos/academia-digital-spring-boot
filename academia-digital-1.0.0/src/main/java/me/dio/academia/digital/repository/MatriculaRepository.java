package me.dio.academia.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find a Matricula by its ID:
    // Optional<Matricula> findById(Long id);
    // Optional<Matricula> findByAlunoId(Long alunoId);
    // Optional<Matricula> findByDataDeMatricula(LocalDate dataDeMatricula);
    List<Matricula> findByAlunoBairro(String bairro);

    
}
