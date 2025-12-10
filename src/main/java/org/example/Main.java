package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Slowa slowa = new Slowa();
        List<String> plecaki = new ArrayList<>();

        plecaki.add("vJrwpWtwJgWrhcsFMMfFFhFp");
        plecaki.add("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        plecaki.add("PmmdzqPrVvPwwTWBwg");
        plecaki.add("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn");
        plecaki.add("ttgJtRGJQctTZtZT");
        plecaki.add("CrZsJsPPZsGzwwsLwLmpwMDw");


        int wynik = slowa.suma(plecaki);
        System.out.println("Wynik: " + wynik);
    }
}