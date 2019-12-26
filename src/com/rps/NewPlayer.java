package com.rps;

import java.util.Scanner;

public class NewPlayer extends Player {
    private String name;

    public String getName() {
        return name;
    }
    public void setName() {
        Scanner playerName = new Scanner(System.in);
        this.name = playerName.nextLine();
    }
}
