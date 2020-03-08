package com.jgdy4.structure;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Getter
@AllArgsConstructor
public class Osoba implements Comparable<Osoba> {

    private String imie;
    private String nazwisko;
    private int wiek;


    @Override
    public int compareTo(Osoba osoba) {
        return Integer.compare(wiek, osoba.getWiek());
    }
}
