package com.company;
import java.util.Scanner;

public class ChallengeDataTypeV2 {
    public static Scanner input = new Scanner (System.in);
/* PSEUDOCODE RACHEL WEGENER
import scanner and create main void
declare original variables given (int i = 4, double d = 4.0, String s = "Greenhill"
create int variable for user (int input1 = user input)
read first line of input, add to int i
create double variable for user (double input2  = user input)
read second line of input, add to double d
create String variable for user (String input3 = user input)
read third line of input, add to String s
printf using .1 for scale
 */

    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";
        integer();
        Double();
        String phrase = input.nextLine();
        string(phrase);


    }
    public static void integer() {
        int i = 4;
        System.out.print("Type your integer: ");
        int input1 = input.nextInt();
        int finalInteger = i + input1;
        System.out.printf("%2d \n", finalInteger);
    }
    public static void Double(){
        double d = 4.0;
        System.out.print("Type your double: ");
        double input2 = input.nextDouble();
        double finalDouble = d + input2;
        System.out.printf(" %1.1f \n", finalDouble);
    }
    public static void string(String phrase){
        String s = "Greenhill ";
        System.out.print("Type your sentence: ");
        String input3 = input.nextLine(); //it will not let me enter input here for some reason
        String sentence = s + input3;
        System.out.printf(" %5s \n", sentence);
    }
}
