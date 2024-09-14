package io.github.nfdeveloper.barber_easy_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.nfdeveloper.barber_easy_api.entities.models.Agendamento;
import io.github.nfdeveloper.barber_easy_api.repositories.AgendamentoRepository;
import jakarta.transaction.Transactional;

@Service
public class AgendamentoService {

	@Autowired
	private AgendamentoRepository repository;
	
	public List<Agendamento> listar(){
		return repository.findAll();
	}
	
	@Transactional
	public Agendamento criar(Agendamento agendamento) {
		return repository.save(agendamento);
	}
}
