package br.com.unicuritiba.arena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.arena.models.Planeta;

public interface PlanetaRepository extends
  JpaRepository<Planeta, Long>{

}
