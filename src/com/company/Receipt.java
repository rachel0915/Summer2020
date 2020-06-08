package com.company;

public class Receipt {

    public static void main(String[] args) {

        // Calculate total owed, assuming 8% tax / 15% tip
        double price1 = 38;
        double price2 = 40;
        double price3 = 30;
        double subtotal = price1+price2+price3;
        final double tax = 0.08;
        final double tip = 0.15;
        final double total = subtotal + subtotal*tax + subtotal*tip;


        System.out.println("Subtotal:");

        System.out.println(38 + 40 + 30);

        System.out.println("Tax:");

        System.out.println((38 + 40 + 30) * .08);

        System.out.println("Tip:");

        System.out.println((38 + 40 + 30) * .15);

        System.out.println("Total:");

        System.out.println(38 + 40 + 30 +

                (38 + 40 + 30) * .15 +

                (38 + 40 + 30) * .08);

    }

}
