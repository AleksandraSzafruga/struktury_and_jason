package com.jgdy4.structure;


import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Osoba> list = new ArrayList<>(Arrays.asList(new Osoba("Jan", "Kowalski", 66),
                new Osoba("Janina", "Kowalski", 64),
                new Osoba("Janka", "Kowalski", 32)));


        list.forEach(System.out::println);
        System.out.println();

        Collections.sort(list);

        list.forEach(System.out::println);
        System.out.println();

        List<OfertaSprzedaży> listaProduktów = new ArrayList<>(Arrays.asList(new OfertaSprzedaży("coś", 23.00),
                new OfertaSprzedaży("coś2", 236.00), new OfertaSprzedaży("coś3", 6)));

        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
            System.out.println("Wybierz sortowanie wpisując:");
            System.out.println("malejąco lub");
            System.out.println("rosnąco");
            komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("listuj")) {
                listaProduktów.forEach(System.out::println);
                System.out.println();
            } else if (komenda.equalsIgnoreCase("malejąco")) {
                Collections.sort(listaProduktów, new OfertaSprzedażyComparator(true));
            } else if (komenda.equalsIgnoreCase("rosnąco")) {
                Collections.sort(listaProduktów, new OfertaSprzedażyComparator(false));
            } else if (komenda.startsWith("dodaj")){
                String[] slowa = komenda.split("");
                String nazwa = slowa[1];
                Double cena = Double.parseDouble(slowa[2]);

                OfertaSprzedaży ofertaSprzedaży = new OfertaSprzedaży(nazwa, cena);
                listaProduktów.add(ofertaSprzedaży);
                System.out.println("Dodano: " + ofertaSprzedaży);
            }
        }
        while (!komenda.equalsIgnoreCase("qiut"));
    }
}
