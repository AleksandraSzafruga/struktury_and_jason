package com.jgdy4.json.zad1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            RecipesResponse response = objectMapper.readValue(new File("recipies.json"), RecipesResponse.class);
            response.getResults().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
