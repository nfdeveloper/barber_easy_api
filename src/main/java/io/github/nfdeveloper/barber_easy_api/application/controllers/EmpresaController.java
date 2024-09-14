package io.github.nfdeveloper.barber_easy_api.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.nfdeveloper.barber_easy_api.entities.models.Empresa;
import io.github.nfdeveloper.barber_easy_api.services.EmpresaService;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaService service;
	
	@GetMapping
	public ResponseEntity<List<Empresa>> listar(){
		return ResponseEntity.status(HttpStatus.OK).body(service.listar());
	}
}
