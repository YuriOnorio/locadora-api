package br.com.etec.yuri.locadoraApi.repository.filme;

import br.com.etec.yuri.locadoraApi.model.Filme;
import br.com.etec.yuri.locadoraApi.repository.filter.FilmeFilter;
import br.com.etec.yuri.locadoraApi.repository.projections.ResumoFilme;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FilmeRepositoryQuery {

    public Page<ResumoFilme> filtrar(FilmeFilter filmeFilter, Pageable pageable);

}
