package com.company;

import java.util.Scanner;

public class June11ClassworkV2 {
    public static Scanner userPhrase = new Scanner(System.in);

 // PSEUDOCODE
    /*Create Scanner object
Print the message for the user
create String object
    get message using nextLine() 
Separate the first word from the rest of the phrase using substring(indexOf)
Identify length of first word (index)
	Index of the string of first word (0, indexOfSpace)
Create a loop to go through each index (0… IndexOfSpace) controlled by length
	Letter → charAt(indexloop)
	Increase index number by 1 for every run of the loop (count++)
Check for repeating letter in first word
Check for letter in message

Eliminate letter from first word (if true)
	First word = first word. substring (0, index of repeating letter) + first word. substring ( index of repeating letter +1)

Print letter and count (if not true)*/


    public static void main(String[] args) {
        System.out.print("Type your message: ");
        String message = userPhrase.nextLine();
        firstWord(message);


    }


    public static void firstWord(String message) {
        int indexOf = message.indexOf(" ");
        String firstWord = message.substring(0, indexOf + 1);
        char letter;
        int count = 0;
        for (int index = 0; index < firstWord.length(); index++) {
            letter = firstWord.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = message.substring(index + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                message = message.replace(letter, ' ');
                firstWord = firstWord.replace(letter, ' ');
                System.out.println(letter + " " + count);
                count = 0;
            }
        }

    }


}





