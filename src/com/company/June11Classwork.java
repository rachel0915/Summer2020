package com.company;
import java.util.*;

public class June11Classwork {
    public static Scanner userPhrase = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Type your message: ");
        String message = userPhrase.nextLine();
        firstWord(message);

    }

    public static void firstWord(String message) {
        int indexOf = message.indexOf(" ");
        String firstWord = message.substring(0, indexOf + 1);
        // message = message - firstWord
        //String remainder = message.substring(indexOf+1);
        char letter;
        int count = 0;
        for (int index = 0; index < firstWord.length(); index++) {
            letter = firstWord.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = firstWord.substring(index + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    //       System.out.println(temp + " " + indexOf);
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                // find rest of the letters in message
                count = restProg(letter, message, count);
                firstWord = firstWord.replace(letter, ' ');
                System.out.println(letter + " " + count);
                count = 0;
            }
        }

    }
    public static int restProg(char letter, String message, int count){
        //solve here
        return count;
    }

}





