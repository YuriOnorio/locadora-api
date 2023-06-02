package br.com.etec.yuri.locadoraApi.repository;

import br.com.etec.yuri.locadoraApi.model.Ator;
import br.com.etec.yuri.locadoraApi.repository.ator.AtorRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Integer>, AtorRepositoryQuery {
}
