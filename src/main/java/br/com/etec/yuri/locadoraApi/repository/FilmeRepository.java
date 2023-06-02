package br.com.etec.yuri.locadoraApi.repository;

import br.com.etec.yuri.locadoraApi.model.Filme;
import br.com.etec.yuri.locadoraApi.repository.filme.FilmeRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface FilmeRepository extends JpaRepository<Filme, Long>, FilmeRepositoryQuery {

}
