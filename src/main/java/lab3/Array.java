/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author sereg
 */
import java.util.Random;
import org.springframework.stereotype.Service;
@Service
public class Array {
    Random random = new Random();
    public int[] arrayInit(int arrayLength, int arrayMax) {

        int[] result = new int[arrayLength];

        for (int j = 0; j < arrayLength; j++) {
            result[j] = random.nextInt(arrayMax + 1);
        }

        return result;
    }
    
    public String arrayPrint(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result=result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
    
    public int[] arrayRange(int n){
        int[] result = new int[n];
        for (int j = 0; j <n; j++) {
            result[j]=j+1;
        }
        return result;
    }
     public String arrayString(int n){
    String result="";
        for (int j = 1; j <= n; j++) {
            result+=j*j;
        }
    return result;
     }
}

    