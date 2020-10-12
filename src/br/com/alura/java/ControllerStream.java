package br.com.alura.java;

import java.util.*;
import java.util.stream.*;

public class ControllerStream {
    public static void main(String[] args) {

        List<Curso> cursos = geraCurso();
        cursos.sort(Comparator.comparing(Curso::getAluno));
        //cursos.sort((c1, c2) -> c1.getAluno() - c2.getAluno());

        //cursos.forEach(c -> System.out.println(c.getNome()));
        int sum = cursos.stream().filter(c -> c.getAluno() >= 300)
                .mapToInt(Curso::getAluno)
                .sum();
        System.out.println(sum);

//        Optional<Curso> curso = cursos.stream().filter(c -> c.getAluno() >= 150)
//                .map(Curso::getAlunos)
//                .findFirst();
        cursos.stream().mapToInt(Curso::getAluno).average().ifPresent(System.out::println);

        List<Curso> cs = List.of(
                new Curso("Ruby", 0),
                new Curso("Kotlin", 0),
                new Curso("Spring", 200)
        );
        System.out.println(cs);

    }

    private static List<Curso> geraCurso(){

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 200));
        cursos.add(new Curso("C#", 146));
        cursos.add(new Curso("JavaScript", 446));
        cursos.add(new Curso("C", 550));
        return cursos;
    }
}


