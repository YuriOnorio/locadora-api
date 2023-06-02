package br.com.etec.yuri.locadoraApi.repository.genero;

import br.com.etec.yuri.locadoraApi.model.Genero;
import br.com.etec.yuri.locadoraApi.repository.filter.GeneroFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GeneroRepositoryQuery {

    public Page<Genero> filtrar(GeneroFilter generoFilter, Pageable pageable);

}