package io.github.nfdeveloper.barber_easy_api.entities.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Contato {

	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "telefone2")
	private String telefone2;
	
	@Column(name = "telefone3")
	private String telefone3;
	
	@Column(name = "telefone4")
	private String telefone4;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "email2")
	private String email2;
	
	@Column(name = "email3")
	private String email3;
	
	@Column(name = "email4")
	private String email4;
}
