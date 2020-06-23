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
    create for loop for even
    create for loop for odd
return even and odd strings to main void
println even and odd indexes together separated by a space
create array for number of strings inputted
create array for output and print

 */
public class ArrayStringChallenge {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int numOfStrings;

        do {
            System.out.println("How many Strings would you like?");
            numOfStrings = userInput.nextInt();  // integer value user types in
        }while(numOfStrings<=0 || numOfStrings>=11); //constraints for integer value

        String stringInput = null;
        String receiveWord;
        String[] stringArray1 = new String[numOfStrings];
        String[] stringArray2 = new String[numOfStrings];
        do {
            int loop;
            for (loop = 0; loop < numOfStrings; loop++) { //for loop controlled by int value
                System.out.println("Enter a String");
                stringInput = userInput.next(); //user inputs a word to be sent to the method
                stringArray1[loop] = stringInput;
                receiveWord = output(stringInput); //returns from method
                stringArray2[loop] = receiveWord;

            }
            System.out.println(Arrays.toString(stringArray2));
        }while(stringInput.length() <= 1 || stringInput.length() >= 10000);
    }

    public static String output(String stringInput){
        String evenString = "";
        String oddString = "";
        int stringLength = stringInput.length(); //number of indexes in word
        for(int evenChars = 0; evenChars < stringLength; evenChars += 2){
            char outputEven = stringInput.charAt(evenChars);
            evenString = evenString+outputEven;
        }
        for(int oddChars = 1; oddChars < stringLength; oddChars += 2){
            char outputOdd = stringInput.charAt(oddChars);
            oddString= oddString+outputOdd;
        }
        return (evenString+" "+oddString);

    }




}
