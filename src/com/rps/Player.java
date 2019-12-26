package com.rps;

import java.util.Scanner;

abstract class Player {
    private String choice;
    private int wins;
    private int losses;

    public String getChoice() {
        return this.choice;
    }
    public void setChoice() {
        Scanner play = new Scanner(System.in);
        String input = play.nextLine();

        if ( !(input.equals("rock")) &&
             !(input.equals("paper")) &&
             !(input.equals("scissors")) &&
             !(input.equals("quit"))) {
            System.out.println("That's invalid input! Try again");
            setChoice();
        }
        else this.choice = input;
    }
}
