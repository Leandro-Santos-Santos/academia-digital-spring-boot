package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class AlunoForm {

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;
}
