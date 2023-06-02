package br.com.etec.yuri.locadoraApi.repository.filme;

import br.com.etec.yuri.locadoraApi.repository.filter.FilmeFilter;
import br.com.etec.yuri.locadoraApi.repository.projections.ResumoFilme;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class FilmeRepositoryImpl implements FilmeRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;
    @Override
    public Page<ResumoFilme> filtrar(FilmeFilter filmeFilter, Pageable pageable) {
        return null;
    }
}
