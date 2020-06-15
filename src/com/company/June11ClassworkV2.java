package com.company;

import java.util.Scanner;

public class June11ClassworkV2 {
    public static Scanner userPhrase = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Type your message: ");
        String message = userPhrase.nextLine();
        firstWord(message);
        //remainder code

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
                System.out.println(letter + " " + count);
                count = 0;
            }
        }

    }


}





