package com.company;
import java.util.*;

/*PSEUDOCODE
import scanner
create new scanner (Scanner userInput = new Scanner(System.in))
set mealCost to user input
set tipPercent to user input
set taxPercent to user input
divide tipPercent by 100 and multiply by 12, name as finalTip
divide taxPercent by 100 and multiply by 12, name as finalTax
add mealCost, finalTip and finalTax together, name totalCost
change double totalCost to int
println totalCost
 */

public class OperatorChallenge {
    public static Scanner userInput = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("Type your meal cost: ");
        double mealCost = userInput.nextDouble();
        System.out.print("Type your tip percentage: ");
        int tipPercent = userInput.nextInt();
        System.out.print("Type your tax percentage: ");
        int taxPercent = userInput.nextInt();


       double tip = tipPercent/100.0;
       double tax = taxPercent/100.0;
       double finalTip = 12 * tip;
       double finalTax = 12 * tax;
       double totalCost = mealCost + finalTax + finalTip;

       totalCost= (int) totalCost;

       System.out.println("Your total cost is: " + totalCost);

    }

}








    /*public static void main (String[] args){
        System.out.print("Enter your meal cost: ");
        double mealCost = userInput.nextDouble();
        userInput.nextLine();
        System.out.print("Enter your tip percent: ");
        int tipPercent = userInput.nextInt();
        System.out.print("Enter your tax percent: ");
        int taxPercent = userInput.nextInt();

        double tip =  tipPercent / 100;
        System.out.println(tip);
        double tax = mealCost * (taxPercent / 100);

        //double totalCost = mealCost + tip + tax;
       // System.out.println("Your total is: " + totalCost);


    }
*/

