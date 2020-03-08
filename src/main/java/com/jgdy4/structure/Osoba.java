package com.jgdy4.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Osoba implements Comparable<Osoba> {

    private String imie;
    private String nazwisko;
    private int wiek;


    @Override
    public int compareTo(Osoba osoba) {

        return Integer.compare(wiek, osoba.getWiek());
    }
}
