package com.jgdy4.json.zad1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jgdy4.structure.Osoba;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Jan", "Kowalski", 36);
        //mapowanie json->obiekt, obiekt->jason
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String reslut = objectMapper.writeValueAsString(osoba);
            System.out.println(reslut);

            //zapis do pliku
            objectMapper.writeValue(new File("person.json"), osoba);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
