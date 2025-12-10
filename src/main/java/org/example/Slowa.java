package org.example;

import java.util.List;

public class Slowa {

    public String pol1(String s) {
        return s.substring(0, s.length() / 2);
    }

    public String pol2(String s) {
        return s.substring(s.length() / 2);
    }

    public char wspolny(String s) {
        String p1 = pol1(s);
        String p2 = pol2(s);

        for (int i = 0; i < p1.length(); i++) {
            for (int j = 0; j < p2.length(); j++) {
                if (p1.charAt(i) == p2.charAt(j)) {
                    return p1.charAt(i);
                }
            }
        }
        return 0;
    }

    public int prio(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a' + 1;
        }
        return c - 'A' + 27;
    }

    public int suma(List<String> lista) {
        int wynik = 0;
        for (String s : lista) {
            char c = wspolny(s);
            wynik = wynik + prio(c);
        }
        return wynik;
    }
}