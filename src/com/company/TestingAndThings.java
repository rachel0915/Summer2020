package com.company;
import java.util.*;
public class TestingAndThings {

    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        String answer;
        Random randy = new Random();
            double doubly1 = 9.98;
            double doubly2 = doubly1 * 3.234234;
            double doubly3 = doubly2 / 2.345345;
            int num1 = 345;
            int num2 = -58;
        do {
            int rand = randy.nextInt(10 +75);
            System.out.printf(" My random is %5d \n", rand);
            System.out.println(" Do you want quit");
            answer = input.next();
        }
        while(answer.contains("n"));
        String whatEver = "Greenhill is awesome";
        System.out.printf("Showing how to use printf \n $%10.3f \n " +
                "$%10.3f \n $%10.3f \n -%6d \n -%6d \n %20.10s", doubly1, doubly2, doubly3, num1, num2, whatEver);

        double double1 = Math.sqrt(1.6754);
        double double2 = Math.abs(Math.tan(5));
        double double3 = Math.min(double1, double2);
        System.out.printf("Our numbers are \n %10.4f \n %10.4f \n %10.4f \n", double1, double2, double3);
    }
}
