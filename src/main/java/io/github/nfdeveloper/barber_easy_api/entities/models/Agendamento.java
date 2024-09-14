package io.github.nfdeveloper.barber_easy_api.entities.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.github.nfdeveloper.barber_easy_api.entities.enums.SituacaoAgendamento;
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
@Table(name = "agen")
public class Agendamento implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dt_agendamento")
	private LocalDateTime dtAgendamento;
	
	@Column(name = "valor",length = 10, precision = 2)
	private Double valor;
	
	@Column(name = "situacao")
	private SituacaoAgendamento situacao;
	
	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name = "servico_id")
	private Servico servico;

}
