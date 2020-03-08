package com.jgdy4.json.zad2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@ToString(of = {"id", "title"})
public class MenuList {


    private int id;
    private String title;
    private String image;
    private String imageType;
    private int usedIngredientCount;
    private int missedIngredientCount;
    private List<MissedIngredients> missedIngredients;
    private List<UsedIngredients> usedIngredients;
    private List<UnusedIngredients> unusedIngredients;
    private int likes;

}
