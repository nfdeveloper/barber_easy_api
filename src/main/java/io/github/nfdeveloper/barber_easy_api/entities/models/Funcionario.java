package io.github.nfdeveloper.barber_easy_api.entities.models;

import java.io.Serializable;

import io.github.nfdeveloper.barber_easy_api.entities.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "funci")
public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sobrenome")
	private String sobrenome;
	
	@Column(name = "apelido")
	private String apelido;
	
	@Column(name = "cpf", unique = true)
	private String cpf;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "chave_pix")
	private String chavePix;
	
	@Column(name = "status")
	private Status status;
	
	@Embedded
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
}
