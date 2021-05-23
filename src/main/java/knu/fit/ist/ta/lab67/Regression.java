/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.util.Arrays;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *
 * @author sereg
 */
public class Regression {
     public boolean isANumber(String s){
    
       if (s.matches("[-+]?\\d+"))
           return true;
       else
           return false;
    }
    
    public int[] translate(String text){
    
        List<String> listResult = Arrays.asList(text.split(" "));
        
        int[] result = new int[listResult.size()];
        int[] fake = {Integer.MIN_VALUE};
        
        if (listResult.size() < 2)
            return fake;
        
        for (int i = 0; i < listResult.size(); i++)
            if (isANumber(listResult.get(i)))
                result[i] = Integer.parseInt(listResult.get(i));
            else 
                return fake;
        
        return result;
    }
    
    public static int numberOf2s(int count,int n) {
        
	if (n >= 1) 
        {
            if(n%10==2) 
                count++;
            return numberOf2s(count, n/10);
        }
        return count;
}
}
