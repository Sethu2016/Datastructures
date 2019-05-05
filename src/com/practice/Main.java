package com.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] array = new int []{1,2,3,3,9,8,4,3,10,10};

         ArrayList<Integer> output = GetUniqueNumbers(array);
        for (Integer out:output) {
            System.out.println(out);
        }
	// write your code here
    }

    private static ArrayList<Integer> GetUniqueNumbers(int[] array){

        ArrayList<Integer> output = new ArrayList<>();

        HashMap<Integer,Integer>  newList = new HashMap<>();

        for(int i=0; i<array.length; i++){



            if(newList.get(array[i]) != null){

                newList.put(array[i],newList.get(array[i])+1);

            }
            else{
                newList.put(array[i],1);
            }
        }

        for ( Integer num : newList.keySet()) {
            if(newList.get(num)==1){
                output.add(num);
            }
            
        }

        return output;
    }
}
