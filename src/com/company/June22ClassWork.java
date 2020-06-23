/*
import java.util class
create new Scanner for user input
create int for number of days user inputs
create do, while loop
    ask user for number of days and put into int variable
    while days is between 2-10
create array for number of days
create new random bound between 25-110
create for loop bound by length of array
    print random value for each day
create double variable for average found by dividing sum of randoms by number of days and print
create for loop bound by number of days
if array is greater than average, add to int count
print count
 */




package com.company;
import java.util.*;
public class June22ClassWork {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int days ;
            do {
                System.out.print("How many days between 2-10 do you want?");
                days = userInput.nextInt();

            } while (days < 2 || days > 101);

        int[] myArray = new int[days];
        Random randy = new Random();
        int dailyTemps = 0;

        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = randy.nextInt(85)+25;
            System.out.println("Day " + (index+1) + " temperature is: " + myArray[index]);
            dailyTemps = dailyTemps + myArray[index];
        }
        double average = (double) dailyTemps/days;
        System.out.println("The average temperature is: " +average);

        int count = 0;
        for(int i= 0; i < days; i++){
            if(myArray[i] > average) {
                count++;
            }
        }
        System.out.println(count+" days above average");

        }

    }


