package com.company;
import java.util.*;
/*
RACHEL WEGENER PSEUDOCODE
import java.util.*
create new Scanner called "userInput"
create constrains on userInput strings on length and how many strings can be written
Int integer = userInput.nextInt()
    create for loop based on integer for how many Strings will be written
find even and odd indexes
println even and odd indexes together separated by a space

 */
public class StringsChallenge {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int numOfStrings;
        do {
            System.out.println("How many Strings would you like?");
            numOfStrings = userInput.nextInt();  // integer value user types in

            for (int loop = 0; loop<= numOfStrings; loop++) { //for loop controlled by int value
                System.out.println("Enter a String");
                String stringInput = userInput.next(); //user inputs a word to be sent to the method
                String receiveWord = output(stringInput); //returns from method
                System.out.println(receiveWord);
            }
        }while(numOfStrings>0 && numOfStrings<10); //constraints for integer value


    }


    public static String output(String stringInput){
        String evenString = "";
        String oddString = "";
        String finalOutput;
        int stringLength = stringInput.length(); //number of indexes in word
        for(int evenChars = 0; evenChars <= stringLength; evenChars = evenChars + 2){
            char outputEven = stringInput.charAt(evenChars);
            evenString = evenString+outputEven;
        }
        for(int oddChars = 1; oddChars <= stringLength; oddChars = oddChars+ 2){
            char outputOdd = stringInput.charAt(oddChars);
            oddString = oddString+outputOdd;
        }
        finalOutput = evenString+" "+oddString;
        return finalOutput;
    }




}
