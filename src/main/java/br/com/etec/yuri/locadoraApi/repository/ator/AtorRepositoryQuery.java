package br.com.etec.yuri.locadoraApi.repository.ator;

import br.com.etec.yuri.locadoraApi.model.Ator;
import br.com.etec.yuri.locadoraApi.repository.filter.AtorFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AtorRepositoryQuery {

    public Page<Ator> filtrar(AtorFilter atorFilter, Pageable pageable);

}
