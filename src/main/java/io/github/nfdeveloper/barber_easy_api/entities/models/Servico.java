package io.github.nfdeveloper.barber_easy_api.entities.models;

import java.io.Serializable;

import io.github.nfdeveloper.barber_easy_api.entities.enums.Status;
import jakarta.persistence.Column;
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
@Table(name = "serv")
public class Servico implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "valor",length = 10, precision = 2)
	private Double valor;
	
	@Column(name = "status")
	private Status status;

	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
}
