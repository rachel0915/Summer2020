package com.company;
/*This is Complex Figure version 2
Using for loop
 06/04/2020*/
public class ComplexFigureV2 {
public static final int SIZE=4;
    public static void main(String[] args) { //MAIN FUNCTION GOES HERE
        //Call all my functions
        Line();
        Top();
        Bottom();
        Line();
    }


// LOOPS START DOWN HERE

    public static void Line() { //This method prints the line
        System.out.print("#");
        //initialize a variable
        //control the variable
        //increment variable by one
        for(int dash=0 ; dash < 4*SIZE ; dash++ ){
            System.out.print("=");
        }
        System.out.println("#");
    }
    public static void Top() { //This method prints the top shape
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesDown(line);
            System.out.print("<>");
            for (int dot = 1; dot <= 4 * line - 4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            spacesDown(line);
            System.out.println("|");
        }
    }
    public static void spacesDown(int line) {
        for (int space = 1; space <= -2 * line + 8; space++) {
            System.out.print(" ");
        }
    }
    public static void Bottom() { //This method prints the bottom shape
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesUp(line);
            System.out.print("<>");
            for (int dot = 1; dot <= -4 * line + 16; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            spacesUp(line);
            System.out.println("|");
        }
    }
    public static void spacesUp(int line) {
        for (int space = 1; space <= 2 * line - 2; space++) {
            System.out.print(" ");
        }

    }



}
