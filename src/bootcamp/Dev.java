package br.com.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosInscritos = new ArrayList<>();
    private List<Curso> cursosConcluidos = new ArrayList<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public void concluirCurso(Curso curso) {
        if (cursosInscritos.contains(curso)) {
            cursosConcluidos.add(curso);
            cursosInscritos.remove(curso);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }
}
