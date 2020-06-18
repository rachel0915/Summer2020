package com.company;

import java.util.Scanner;

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

public class OperatorChallengeV2 {
    public static Scanner userInput = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("Type your meal cost: ");
        double mealCost = userInput.nextDouble();
        System.out.print("Type your tip percentage: ");
        int tipPercent = userInput.nextInt();
        System.out.print("Type your tax percentage: ");
        int taxPercent = userInput.nextInt();
        solve(mealCost, tipPercent, taxPercent);

    }

    public static void solve(double mealCost, int tipPercent, int taxPercent){
        double tip = tipPercent/100.0;
        double tax = taxPercent/100.0;
        double finalTip = 12 * tip;
        double finalTax = 12 * tax;
        double totalCost = mealCost + finalTax + finalTip;

        totalCost= (int) totalCost;

        System.out.println("Your total cost is: " + totalCost);

    }

}










