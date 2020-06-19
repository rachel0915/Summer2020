package com.company;
import java.util.*;
/*
PSEUDOCODE CONDITIONAL STATEMENT
import java.util.*
create new Scanner called "input"
create new Random integer 'n'
create String userAnswer for user
create a do, while loop
create new method for if else statements in do loop
in do loop:
    if n != (n/2)*2, println "weird"
    if n ==(n/2)*2 and inclusive between 2 and 5, println "not weird"
    if n ==(n/2)*2  and inclusive between 6 and 20, println "weird"
    if n ==(n/2)*2  and greater than 20, println "not weird"
    println "Do you want to continue?"
in while loop
    userAnswer contains "y"

 */

public class ConditionalStatement {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);  //NEW SCANNER
        Random num = new Random();   //NEW RANDOM
        String userAnswer;   //STRING FOR USER INPUT
        do {
            int n = num.nextInt(137)+1; //CREATE INT N VALUE
            answer(n); //SEND INT N VALUE TO METHOD
            System.out.println("Do you want to continue?");
            userAnswer = input.next(); //USER INPUT TO RERUN PROGRAM
        }
        while(userAnswer.contains("y"));
    }

    public static void answer(int n){ //RECEIVE INT N VALUE
        if(n != (n/2)*2){                                //IF - ELSE STATEMENTS FOR N VALUE
            System.out.println("Your number is "+ n);
            System.out.println("Weird");
        }
        else if(n >=2 && n <=5 && n==(n/2)*2){
            System.out.println("Your number is "+ n);
            System.out.println("Not weird");
        }
        else if(n >=6 && n<=20 && n==(n/2)*2) {
            System.out.println("Your number is "+ n);
            System.out.println("Weird");
        }
        else if(n>20 && n==(n/2)*2){
            System.out.println("Your number is "+ n);
            System.out.println("Not weird");
        }
    }

}
