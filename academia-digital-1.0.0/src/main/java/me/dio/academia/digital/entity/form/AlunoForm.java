package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity



public class AlunoForm {

  @NotBlank(message = "Prencha o campo corretamento.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' deve ter entre {min} e {max} caracteres.")

  private String nome;
  @NotBlank(message = "Prencha o campo corretamento.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' deve ter entre {min} e {max} caracteres.")

  private String cpf;
  @NotBlank(message = "Prencha o campo corretamento.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' deve ter entre {min} e {max} caracteres.")

  private String bairro;
  @NotNull(message = "Prencha o campo corretamento.")
  @Past(message = "Data '${validatedValue}' é inválida.")

  private LocalDate dataDeNascimento;
}
