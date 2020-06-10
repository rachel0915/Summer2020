package com.company;

public class Challenge3KShape {
    //PSEUDO-CODE
    //top:create for loop letter=65 letter<=70 letter++
    //bottom: reverse for loop

    public static void main(String[] args){
        char beginning=65;
        for(int line=6 ; line > 0 ; line--){
            for(int let = 0; let < line ; let++){
                System.out.print((char)(beginning + let) + " ");
            }
            System.out.println();
        }
        for(int line=1 ; line <=6 ; line++){
            for(int let = 0 ; let < line ; let++){
                System.out.print((char)(beginning + let) + " ");
            }
            System.out.println();
        }

    }



}
