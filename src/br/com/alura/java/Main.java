package br.com.alura.java;

import java.util.*;
import java.util.function.*;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("PHP");
        palavras.add("JAVA");
        palavras.add("KOTLIN");

//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        palavras.forEach((String s) -> System.out.println(s));
        palavras.forEach(System.out::println);
//        palavras.sort( (s1, s2) -> s2.length() - s1.length() );
        palavras.sort(comparing(String::length));
        System.out.println(palavras);


    }
}

class ImprimeLinha implements Consumer<String>{
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorDeTamanho implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (o2.length()) - (o1.length());
    }
}


