package io.github.nfdeveloper.barber_easy_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.nfdeveloper.barber_easy_api.entities.models.Empresa;
import io.github.nfdeveloper.barber_easy_api.repositories.EmpresaRepository;
import jakarta.transaction.Transactional;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repository;

	public List<Empresa> listar(){
		return repository.findAll();
	}
	
	@Transactional
	public Empresa criar(Empresa empresa) {
		return repository.save(empresa);
	}
}
