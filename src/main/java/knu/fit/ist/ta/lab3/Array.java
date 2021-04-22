/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.util.Random;
import org.springframework.stereotype.Service;
/**
 *
 * @author sereg
 */

@Service
public class Array {
    Random rand = new Random();
    public int[] arrayInit(int arrayLength, int arrayMax) {
        int[] result = new int[arrayLength];

        for (int j = 0; j < arrayLength; j++) {
            result[j] = rand.nextInt(arrayMax + 1);
        }

        return result;
    }
    
     public String func(int[] array)
     {
        int max_index = 0;
        int max_numb = 0;
        for (int j = 0; j < array.length; j++) 
        {
            if (array[j] > max_numb)
            {
               max_numb = array[j];
               max_index = j;
            }
            else if (array[j] == 0){return "" + max_index;}
            
        }
        return "there is no zero number"; 
     }
        
    
    public String print(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result=result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
     
}

    