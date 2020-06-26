package com.company;

import java.util.*;

public class Array3 {

    public static void main(String[] args){

        //declare array
        int [] numbers = {3,5,12,43,5,76,9,1};
        int len = numbers.length;
        System.out.println("The array "+ Arrays.toString(numbers) +" has "+len+" elements");
        //create random object to feed new array
        Random rand = new Random(); //this only creates object
        int [] num2 = new int[5];
        for(int i=0; i<num2.length; i++){
            num2[i]= rand.nextInt(70)+20; //bound is range of values plus minimum
        }
        System.out.println(Arrays.toString(num2));
        num2 = reverse(num2);
        System.out.println(Arrays.toString(num2));

    } //end main

    public static int[] reverse(int [] array){
        for(int i= 0; i < array.length / 2; i++){ //need half of index bc we are swapping
            int temp = array[i];
            array[i] = array[array.length - 1- i];
            array[array.length - 1 -i] = temp;
        }
        return array;

    } //end method


} //end program
