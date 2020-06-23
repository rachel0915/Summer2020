/*
PSEUDOCODE
import java.util
create new random 5-10 for array size
create new variable "size" to put into array1 size
create for loop controlled by length of array1
       make new array controlled by random size
       create new random for array elements
print array
create do, while loop
    do index1 = rand.nextInt(size)
    do index2 = rand.nextInt(size)
    while index1 == index2
create method to send array and two indexes for swapping
    swap two indexes using array
    return array to main
print array
 */

package com.company;
import java.util.*;
public class June23Classwork {

    public static void main(String[] args){

        Random rand1 = new Random();     //new Random object
        int size = rand1.nextInt(5)+5; //variable size for array
        int [] array1 = new int[size]; //array with size decided by random int

        for (int i=0; i<array1.length; i++){
            array1[i] = rand1.nextInt(90)+10; //bound between 10-100
        }

        int index1;
        int index2;
        do{
            index1 = rand1.nextInt(size);
            index2 = rand1.nextInt(size);

        }while (index1 == index2);

        System.out.println(Arrays.toString(array1));
        array1 = swap(array1, index1, index2); //send array and indexes to method
        System.out.println(Arrays.toString(array1));

    }


    public static int[] swap(int [] array, int num1, int num2 ){
            int temp = array[num1];
            array[num1] = array[num2];
            array[num2] = temp;

        return array;

    }


}
