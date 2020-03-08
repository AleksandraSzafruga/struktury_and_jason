package com.jgdy4.json.zad3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@ToString(of = {"type", "title"})

public class MenuItemResponse {

    private String type;
    private List<MenuItem> menuItems;
    private int offset;
    private int number;
    private int totalMenuItems;
    private int processingTimeMs;
    private long expires;
}
