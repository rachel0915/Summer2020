package com.company;
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

    public static void main(String[] args){
        String firstName = "Rachel";
        String lastName = "Wegener";
        char letter = firstName.charAt(0);
        System.out.print(letter + ". Diddy " + lastName.toUpperCase() + " " + firstName + "-izzle");

    }

}
