package br.edu.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return this.cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Mentoria> getMentorias() {
        return this.mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public List<Dev> getDevs() {
        return this.devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }
    private List<Dev> devs;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void adicionarDev(Dev dev) {
        devs.add(dev);
    }

    public void setDescricao(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescricao'");
    }

    public Set<Conteudo> getDevsInscritos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDevsInscritos'");
    }

    public Collection<? extends Conteudo> getConteudos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConteudos'");
    }

    // Getters e setters omitidos para brevidade
}
