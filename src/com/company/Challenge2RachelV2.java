package com.company;
/*This is Challenge 2
Used with loops
 06/07/2020*/
public class Challenge2RachelV2 {

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

    public static void Line(){
        System.out.print("+");
        for(int dash = 1 ; dash <= 9 ; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Top() {
        for(int line = 1 ; line <= 4 ; line++){
            System.out.print("|");
            for(int space = 1 ; space <= -1 * line + 5 ; space++){
                System.out.print(" ");
            }
            for(int fslash = 1 ; fslash <= 1 * line - 1 ; fslash++){
                System.out.print("/");
            }
            System.out.print("*");
            for(int bslash = 1 ; bslash <= 1 * line - 1 ; bslash++){
                System.out.print("\\");
            }
            for(int space = 1 ; space <= -1 * line + 5 ; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for(int line = 1 ; line <= 4 ; line++){
            System.out.print("|");
            for(int space = 1 ; space <= 1 * line ; space++){
                System.out.print(" ");
            }
            for(int bslash = 1 ; bslash <= -1 * line + 4 ; bslash++){
                System.out.print("\\");
            }
            System.out.print("*");
            for(int fslash = 1 ; fslash <= -1 * line + 4 ; fslash++){
                System.out.print("/");
            }
            for(int space = 1 ; space <= 1 * line ; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

}
