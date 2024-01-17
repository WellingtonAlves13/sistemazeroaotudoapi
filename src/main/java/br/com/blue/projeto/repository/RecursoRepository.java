package br.com.blue.projeto.repository;

import br.com.blue.projeto.entity.RecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RecursoRepository extends JpaRepository<RecursoEntity,Long > {
}
