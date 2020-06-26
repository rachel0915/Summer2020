/*
PSEUDOCODE
import java.io.*;
import java.util.*
create welcome screen using new public static void
    create pattern using for loop(?)
create new File
create new Scanner to read File
create new Scanner to read user input
Ask user to guess either a number or word
    If answer word, go to return method
    Ask user to guess a state in the country
        If correct, add to correct count and to playing count and return back
        If incorrect, add only to playing count and return back
    If answer number, ask whether integer (easy) or double (hard)
    If integer, ask to guess between 1-30 inclusive
        If correct, add to correct count and to playing count and return back
        If incorrect, add only to playing count and return back
    If double, ask to guess between 2.0 and 15.0 inclusive
        If correct, add to correct count and to playing count and return back
        If incorrect, add only to playing count and return back
Ask user if they want to quit after each guess
    If yes, go to end screen
        Display correct count and playing count
    If no, return to start
 */

package com.company;
import java.io.*;
import java.util.*;
public class FinalProjectWordGame {
    public static int countAttempts=0;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("/Users/rachelwegener/IdeaProjects/Summer2020/src/com/company/finalProject.txt");
        Scanner fileScan = new Scanner(file);
        Scanner userInput = new Scanner(System.in);
        String game;
        String numberGame;
        String answer;
        int countWins=0;
        Welcome();
        do {
            System.out.println("Do you want to play word or numbers?");
            game = userInput.next();
            if(game.contains("ountries")){
                System.out.println("Enter a country or U.S state (capitalize each word and do not use spaces)");
                String states = userInput.next();
                countWins = gameWords(states, fileScan, countWins);
                System.out.println("Total games won: "+countWins);
                System.out.println("Total games played: "+countAttempts);
            }
            if(game.contains("umber")){
                System.out.println("Do you want to play integers (easy) or doubles (hard)?");
                numberGame = userInput.next();
                if(numberGame.contains("nteger")){
                    System.out.println("Guess an integer between 1 amd 100 inclusive");
                    int intGuess = userInput.nextInt();
                    countWins = gameInteger(intGuess, fileScan, countWins);
                    System.out.println("Total games won: "+countWins);
                    System.out.println("Total games played: "+countAttempts);
                }
                if(numberGame.contains("ouble")) {
                    System.out.println("Guess an double between 1.0 and 100.0 inclusive");
                    double doubleGuess = userInput.nextDouble();
                    doubleGuess = (((int)(doubleGuess*100))/100.0);
                    countWins = gameDouble(doubleGuess, fileScan, countWins);
                    System.out.println("Total games won: "+countWins);
                    System.out.println("Total games played: "+countAttempts);
                }
            }

            System.out.println("Do you want to play again?");
            answer = userInput.next();
        }while(answer.contains("es"));
        System.out.println("Total games won: "+countWins);
        System.out.println("Total games played: "+countAttempts);

        fileScan.close();
    } //end main

    public static int gameWords (String states, Scanner fileScan, int countWins) {
        while (fileScan.hasNextLine()) {
            if (fileScan.hasNext()) {
                if (fileScan.next().equals(states)) {
                    System.out.println("Correct!");
                    countWins++;
                    break;
                }
            }
            else {
                String trash = fileScan.next();
            }
        }
        countAttempts++;
        return countWins;
    } //end

    public static int gameInteger (int intGuess, Scanner fileScan, int countWins){
        while (fileScan.hasNextLine()) {
            if (fileScan.hasNextInt()) {
                if (fileScan.nextInt() == (intGuess)) {
                    System.out.println("Correct!");
                    countWins++;
                    break;
                }
            }
            else {
                    String trash = fileScan.next();
            }
        }
        countAttempts++;
        return countWins;
    } //end

    public static int gameDouble (double doubleGuess, Scanner fileScan, int countWins){
        while (fileScan.hasNextLine()) {
            if (fileScan.hasNextDouble()) {
                if (fileScan.nextDouble() == (doubleGuess)) {
                    System.out.println("Correct!");
                    countWins++;
                    break;
                }
            }
            else {
                String trash = fileScan.next();
            }
        }
        countAttempts++;
        return countWins;
    } //end

    public static void Welcome(){
        for(int star = 1; star <24; star++){
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print("|");
        for(int line = 1; line <22; line++){
            System.out.print("-");
        }
        System.out.println("|");
        System.out.println("|   Welcome player!   |");
        System.out.print("|");
        for(int line = 1; line <22; line++){
            System.out.print("-");
        }
        System.out.println("|");
        for(int star = 1; star <24; star++){
            System.out.print("*");
        }
        System.out.println(" ");

    } //end welcome void

} //end program
