package br.com.etec.yuri.locadoraApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ator")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String nomeator;

    @JsonIgnore
    @OneToMany(mappedBy = "ator")
    private List<Filme> filmesator = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }

    public List<Filme> getFilmesator() {
        return filmesator;
    }

    public void setFilmesator(List<Filme> filmesator) {
        this.filmesator = filmesator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ator ator = (Ator) o;
        return Objects.equals(id, ator.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
