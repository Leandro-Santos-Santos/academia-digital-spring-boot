package me.dio.academia.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    // Custom query methods can be defined here if needed
    // For example, to find an Aluno by their name:
    // List<Aluno> findByName(String name);
}
