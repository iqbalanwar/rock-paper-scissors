package com.rps;

import java.util.Scanner;

public class Main {

    static String history = "";

    public static void main(String[] args) {
        NewPlayer playerOne = new NewPlayer();
        menu(playerOne);
    }

    public static void menu(NewPlayer playerOne) {
        String menuInput = "";

        while(!menuInput.equalsIgnoreCase("quit")) {

            System.out.println("Welcome to Rock, Paper, Scissors!\n");
            System.out.println("MAIN MENU\n=====\n" +
                    "1. Type 'play person' to play someone else\n" +
                    "2. Type 'play comp' to play a computer\n" +
                    "3. Type 'history' to game history\n" +
                    "3. Type 'quit' to stop playing\n");

            Scanner menu = new Scanner(System.in);
            menuInput = menu.nextLine();

            switch(menuInput) {
                case "play comp":
                    System.out.println("Type 'rock','paper', or 'scissors' to play.\n" +
                            "Type 'quit' to go back to the main menu.");
                    playerVsComp(playerOne);
                    break;
                case "play person":
                    System.out.println("Type 'rock','paper', or 'scissors' to play.");
                    playerVsPlayer(playerOne);
                    break;
                case "history":
                    System.out.println("==== GAME HISTORY ====\n" + history);
                    break;
                case "quit":
                    break;
                default:
                    System.out.println("Invalid menu input");
                    break;
            }
        }
    }

    public static void getPlayerVsCompChoices(NewPlayer player, Computer comp) {
        System.out.println("Computer picks: " + comp.getChoice());
        System.out.println("User picks: " + player.getChoice());
    }
    public static void playerVsComp(NewPlayer playerOne) {
        Computer comp = new Computer();
        comp.setChoice();
        String compChoice = comp.getChoice().toLowerCase();

        System.out.print("Player One: ");
        playerOne.setChoice();
        String playerChoice = playerOne.getChoice().toLowerCase();

        if(playerChoice.equals("quit")) {
            menu(playerOne);
        }

        if ((playerChoice.equals("rock") && compChoice.equals("scissors")) ||
                (playerChoice.equals("scissors") && compChoice.equals("paper")) ||
                (playerChoice.equals("paper") && compChoice.equals("rock"))) {
            getPlayerVsCompChoices(playerOne, comp);
            System.out.println("You win!!!");
            System.out.println("");
            history += "WIN: Default player chose " + playerChoice + ", and computer chose " + compChoice + "\n";
        } else {
            if (playerChoice.equals(compChoice)) {
                getPlayerVsCompChoices(playerOne, comp);
                System.out.println("It's a tie!");
                System.out.println("");
                history += "TIE: Default player chose " + playerChoice + ", and computer chose " + compChoice + "\n";
            } else {
                getPlayerVsCompChoices(playerOne, comp);
                System.out.println("You lose...");
                System.out.println("");
                history += "LOSS: Default player chose " + playerChoice + ", and computer chose " + compChoice + "\n";
            }
        }
    }


    public static void getPlayerVsPlayerChoices(NewPlayer p1, NewPlayer p2) {
        System.out.println(p1.getName() + " chose " + p1.getChoice());
        System.out.println(p2.getName() + " chose " + p2.getChoice());
    }
    public static void playerVsPlayer(NewPlayer playerOne) {
        NewPlayer playerTwo = new NewPlayer();

        System.out.print("Player One, what's your name? ");
        playerOne.setName();
        System.out.print("Player Two, what's your name? ");
        playerTwo.setName();


        System.out.print(playerOne.getName() + "'s Choice: ");
        playerOne.setChoice();
        String playerChoice = playerOne.getChoice().toLowerCase();

        System.out.print(playerTwo.getName() + "'s Choice: ");
        playerTwo.setChoice();
        String p2Choice = playerTwo.getChoice().toLowerCase();


        if ((playerChoice.equals("rock") && p2Choice.equals("scissors")) ||
                (playerChoice.equals("scissors") && p2Choice.equals("paper")) ||
                (playerChoice.equals("paper") && p2Choice.equals("rock"))) {
            getPlayerVsPlayerChoices(playerOne, playerTwo);
            System.out.println(playerOne.getName() + " wins!!!");
            System.out.println("");
            history += "WIN: " + playerOne.getName() + " chose " + playerChoice + ", LOSS: " + playerTwo.getName() + " chose " + p2Choice + "\n";
        } else {
            if (playerChoice.equals(p2Choice)) {
                getPlayerVsPlayerChoices(playerOne, playerTwo);
                System.out.println("It's a tie!");
                System.out.println("");
                history += "TIE: " + playerOne.getName() + " chose " + playerChoice + ", and " + playerTwo.getName() + " chose " + p2Choice + "\n";
            } else {
                getPlayerVsPlayerChoices(playerOne, playerTwo);
                System.out.println(playerTwo.getName() + " wins!!!");
                System.out.println("");
                history += "LOSS: " + playerOne.getName() + " chose " + playerChoice + ", WIN: " + playerTwo.getName() + " chose " + p2Choice + "\n";
            }
        }
    }
}
