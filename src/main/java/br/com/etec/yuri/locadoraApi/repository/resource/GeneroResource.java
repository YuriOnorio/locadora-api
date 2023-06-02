package br.com.etec.yuri.locadoraApi.repository.resource;

import br.com.etec.yuri.locadoraApi.model.Genero;
import br.com.etec.yuri.locadoraApi.repository.GeneroRepository;
import br.com.etec.yuri.locadoraApi.repository.filter.GeneroFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/generos")
public class GeneroResource {

    @Autowired
    private GeneroRepository generoRepository;

    @GetMapping("/todos")
    public List<Genero> listarTodosGeneros() {
        return generoRepository.findAll(Sort.by("descricao").ascending());
    }

    public Page<Genero> pesquisar(GeneroFilter generoFilter, Pageable pageable) {
        return generoRepository.filtrar(generoFilter, pageable);
    }

}
