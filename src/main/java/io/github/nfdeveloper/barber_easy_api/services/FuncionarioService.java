package io.github.nfdeveloper.barber_easy_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.nfdeveloper.barber_easy_api.entities.models.Funcionario;
import io.github.nfdeveloper.barber_easy_api.repositories.FuncionarioRepository;
import jakarta.transaction.Transactional;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario> listar(){
		return repository.findAll();
	}
	
	@Transactional
	public Funcionario criar(Funcionario funcionario) {
		return repository.save(funcionario);
	}
	
}
