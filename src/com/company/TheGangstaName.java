package com.company;
import java.util.*;
/*Write a program that outputs a person's "gangsta name."
–first initial
–Diddy
–last name (all caps)
–first name
-izzle
Example Output:
Type your name, playa: Marge Simpson
Your gangsta name is "M. Diddy SIMPSON Marge-izzle"*/

/* Create string for first name
Create string for last name
Create a variable that finds the first letter of the first name
Print variable + ". Diddy" + last name in uppercase + first name + -izzle
 */
public class TheGangstaName {
public static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args){ //MAIN FUNCTION
        System.out.print("Type your name, playa: ");
        String fullName = keyboard.nextLine();
        System.out.print("Your gangsta name is ");
        initial(fullName);
        System.out.print(". Diddy");
        lastName(fullName);
        firstName(fullName);
        System.out.print("-izzle");
    }


    public static void initial(String fullName ){ //SUB FUNCTION
        char letter = fullName.charAt(0);
        System.out.print(letter);
    }

    public static void firstName(String fullName){
        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        System.out.print(" " + firstName);


    }
    public static void lastName(String fullName){
        int indexOfSpace = fullName.indexOf(" ");
        if (indexOfSpace > 0){
            String lastName = fullName.substring(indexOfSpace);
            lastName = lastName.toUpperCase();
            System.out.print(lastName);
        }
    }

}
