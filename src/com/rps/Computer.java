package com.rps;

import java.util.Random;

public class Computer {
    private String choice;

    public String getChoice() {
        return choice;
    }

    public void setChoice() {
        double chooseRPS = Math.random() * 3;
        if (chooseRPS >= 0 && chooseRPS < 1)
            this.choice = "rock";
        else if (chooseRPS >= 1 && chooseRPS < 2)
            this.choice = "paper";
        else
            this.choice = "scissors";
    }
}
