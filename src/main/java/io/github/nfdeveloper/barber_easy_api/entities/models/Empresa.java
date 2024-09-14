package io.github.nfdeveloper.barber_easy_api.entities.models;

import java.io.Serializable;

import io.github.nfdeveloper.barber_easy_api.entities.enums.Situacao;
import io.github.nfdeveloper.barber_easy_api.entities.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "emp")
public class Empresa implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "razao_social")
	private String razaoSocial;
	
	@Column(name = "fantasia")
	private String fantasia;
	
	@Column(name = "cnpj", unique = true)
	private String cnpj;
	
	@Column(name = "responsavel")
	private String responsavel;
	
	@Column(name = "situacao")
	private Situacao situacao;
	
	@Column(name = "status")
	private Status status;
	
	@Embedded
	private Endereco endereco;
}
