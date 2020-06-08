package com.company;
/*This is Challenge 2
 06/04/2020*/
public class Challenge2Rachel {

    public static void main(String[] args) { //main function
    //Challenge 2
        System.out.println("+---------+");
        Box1();
        Box2();
        System.out.println("+---------+");
        Box2();
        Box1();
        System.out.println("+---------+");
    }
    public static void Box1() {
        System.out.println("|    *    |");
        System.out.println("|   /*\\   |");
        System.out.println("|  //*\\\\  |");
        System.out.println("| ///*\\\\\\ |");
    }
    public static void Box2() {
        System.out.println("| \\\\\\*/// |");
        System.out.println("|  \\\\*//  |");
        System.out.println("|   \\*/   |");
        System.out.println("|    *    |");
    }
}
