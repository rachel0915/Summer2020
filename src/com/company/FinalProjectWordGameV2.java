/*
PSEUDOCODE RACHEL WEGENER
import java.io.*;
import java.util.*
create welcome screen using new public static void
    create pattern using for loop
create new File
create new Scanner to read File
create new Scanner to read user input
Ask user to guess either a number or word
    If answer word, go to return method
    Ask user to guess a state or country
        If correct, add to correct count and to playing count and return back
        If incorrect, add only to playing count and return back
    If answer number, ask whether integer (easy) or double (hard)
    If integer, ask to guess between 1-100 inclusive
        If correct, add to correct count and to playing count and return back
        If incorrect, add only to playing count and return back
    If double, ask to guess between 1.0 and 100.0 inclusive
        If correct, add to correct count and to playing count and return back
        If incorrect, add only to playing count and return back
Ask user if they want to continue after each guess
    If yes, return to start
    If no, go to end screen
        Display correct count and playing count
 */

package com.company;
import java.io.*;
import java.util.*;
public class FinalProjectWordGameV2 {
    public static int countAttempts=0;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("/Users/rachelwegener/IdeaProjects/Summer2020/src/com/company/finalProject.txt");
        Scanner userInput = new Scanner(System.in);
        String game;
        String numberGame;
        String answer;
        int countWins=0;
        Welcome();
        do { //do loop for game to be repeated
            Scanner fileScan = new Scanner(file);
            System.out.println("Do you want to play places or numbers?");
            game = userInput.next();
            if(game.contains("n") || game.contains("N")){
                System.out.println("Do you want to play integers (easy) or doubles (hard)?");
                numberGame = userInput.next();
                if(numberGame.contains("i") || numberGame.contains("I")){
                    System.out.println("Guess an integer between 1-100 inclusive");
                    int intGuess = userInput.nextInt();
                    countWins = gameInteger(intGuess, fileScan, countWins);
                }
                else {
                    System.out.println("Guess an double between 1.0 and 100.0 inclusive");
                    double doubleGuess = userInput.nextDouble();
                    doubleGuess = (((int)(doubleGuess*100))/100.0);
                    countWins = gameDouble(doubleGuess, fileScan, countWins);
                }
            }
            else{
                System.out.println("Enter a state or country (capitalize each word, no spaces):");
                String states = userInput.next();
                countWins = gameWords(states, fileScan, countWins);
            }

            System.out.println("Do you want to play again?");
            answer = userInput.next();
            fileScan.close();
        }while(answer.contains("y") || answer.contains("Y"));
        for(int dash = 1; dash <27; dash++){ //creates end screen when user quits
            System.out.print("-");
        }
        System.out.println(" ");
        System.out.print("|");
        System.out.print("Total games won: "+countWins);
        System.out.println("      |");
        System.out.print("|");
        System.out.print("Total games played: "+countAttempts);
        System.out.println("   |");
        for(int dash = 1; dash <27; dash++){
            System.out.print("-");
        }
    }

    public static int gameWords (String states, Scanner fileScan, int countWins) { //returns win count for word game
        while (fileScan.hasNext()) {
            if (fileScan.next().equals(states)) {
                System.out.println("Correct!");
                countWins++;
                break;
            }
        }
        countAttempts++;
        return countWins;
    }

    public static int gameInteger (int intGuess, Scanner fileScan, int countWins){ //returns win count for integer game
        while (fileScan.hasNext()) {
            if (fileScan.hasNextInt()) {
                if (fileScan.nextInt() == intGuess) {
                    System.out.println("Correct!");
                    countWins++;
                    break;
                }
            } else fileScan.next();
        }
        countAttempts++;
        return countWins;
    }

    public static int gameDouble (double doubleGuess, Scanner fileScan, int countWins){ //returns win count for double game
        while (fileScan.hasNext()) {
            if (fileScan.hasNextDouble()){
                if (fileScan.nextDouble() == (doubleGuess)) {
                    System.out.println("Correct!");
                    countWins++;
                    break;
                }
            }else fileScan.next();
        }
        countAttempts++;
        return countWins;
    }

    public static void Welcome(){ //creates welcome screen at beginning
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
