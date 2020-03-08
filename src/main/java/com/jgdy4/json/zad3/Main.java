package com.jgdy4.json.zad3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jgdy4.json.zad1.RecipesResponse;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            MenuItemResponse response = objectMapper.readValue(new File("recipies.json"), MenuItemResponse.class);
            response.getMenuItems().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

