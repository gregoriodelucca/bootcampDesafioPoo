package br.com.bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java Básico", "Aprenda os fundamentos de Java", 10);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Tira-dúvidas sobre Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do bootcamp Java");
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarMentoria(mentoriaJava);

        Dev dev1 = new Dev("João");
        dev1.inscreverCurso(cursoJava);

        System.out.println("Dev inscrito: " + dev1.getNome());
        System.out.println("Cursos Inscritos: " + dev1.getCursosConcluidos());

        dev1.concluirCurso(cursoJava);

        System.out.println("Cursos Concluídos: " + dev1.getCursosConcluidos());
    }
}
