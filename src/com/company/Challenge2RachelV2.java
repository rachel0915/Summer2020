package com.company;
/*This is Challenge 2
Used with loops
 06/07/2020*/
public class Challenge2RachelV2 {
public static final int SIZE = 7;
    public static void main(String[] args) { //MAIN FUNCTION
    //Challenge 2 with loops
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }

    //LOOPS START DOWN HERE

    public static void Line(){ //This prints the line pattern
        System.out.print("+");
        for(int dash = 1 ; dash <= 2*SIZE+1 ; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Top() { //This prints the top section of the pattern
        for(int line = 1 ; line <= SIZE ; line++){
            System.out.print("|");
            for(int space = 1 ; space <= -1 * line + SIZE +1 ; space++){
                System.out.print(" ");
            }
            for(int fslash = 1 ; fslash <= 1 * line - 1 ; fslash++){
                System.out.print("/");
            }
            System.out.print("*");
            for(int bslash = 1 ; bslash <= 1 * line - 1 ; bslash++){
                System.out.print("\\");
            }
            for(int space = 1 ; space <= -1 * line + SIZE +1 ; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() { //This prints the bottom section of the pattern
        for(int line = 1 ; line <= SIZE ; line++){
            System.out.print("|");
            for(int space = 1 ; space <= 1 * line ; space++){
                System.out.print(" ");
            }
            for(int bslash = 1 ; bslash <= -1 * line + SIZE ; bslash++){
                System.out.print("\\");
            }
            System.out.print("*");
            for(int fslash = 1 ; fslash <= -1 * line + SIZE ; fslash++){
                System.out.print("/");
            }
            for(int space = 1 ; space <= 1 * line ; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

}
