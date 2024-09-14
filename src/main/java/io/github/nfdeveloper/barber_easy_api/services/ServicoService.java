package io.github.nfdeveloper.barber_easy_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.nfdeveloper.barber_easy_api.entities.models.Servico;
import io.github.nfdeveloper.barber_easy_api.repositories.ServicoRepository;
import jakarta.transaction.Transactional;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository repository;
	
	public List<Servico> listar(){
		return repository.findAll();
	}
	
	@Transactional
	public Servico criar(Servico servico) {
		return repository.save(servico);
	}
}
