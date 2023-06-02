package br.com.etec.yuri.locadoraApi.repository;

import br.com.etec.yuri.locadoraApi.model.Genero;
import br.com.etec.yuri.locadoraApi.repository.genero.GeneroRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository <Genero, Integer>, GeneroRepositoryQuery {
}
