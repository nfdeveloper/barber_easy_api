package io.github.nfdeveloper.barber_easy_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.nfdeveloper.barber_easy_api.entities.models.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

}
