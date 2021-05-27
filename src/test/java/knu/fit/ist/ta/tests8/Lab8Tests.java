/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.tests8;

import knu.fit.ist.ta.lab8.Search;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author sereg
 */
@SpringBootTest
public class Lab8Tests {
    Search sea = new Search();
    
    int[] first = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    int[] second = {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3};
    @Test 
        void testforlab8Check(){
            assertEquals(String.valueOf(sea.linearSearch(first, 4)), "4");
            assertEquals(String.valueOf(sea.linearSearch(first, 7)), "7");
            assertEquals(String.valueOf(sea.linearSearch(first, 0)), "0");
            assertEquals(String.valueOf(sea.linearSearch(first, 2)), "2");
            
            assertEquals(String.valueOf(sea.binarySearch(first, 4)), "4");
            assertEquals(String.valueOf(sea.binarySearch(first, 7)), "7");
            assertEquals(String.valueOf(sea.binarySearch(first, 0)), "0");
            assertEquals(String.valueOf(sea.binarySearch(first, 2)), "2");
            
            assertEquals(String.valueOf(sea.jumpSearch(first, 4)), "4");
            assertEquals(String.valueOf(sea.jumpSearch(first, 7)), "7");
            assertEquals(String.valueOf(sea.jumpSearch(first, 0)), "0");
            assertEquals(String.valueOf(sea.jumpSearch(first, 2)), "2");
        }
         @Test 
        void test2forlab8Check() {  
            assertEquals(String.valueOf(sea.linearSearch(second, 2)), "2");
            assertEquals(String.valueOf(sea.binarySearch(second, 2)), "26");
            assertEquals(String.valueOf(sea.jumpSearch(second, 2)), "6");
            
        }          
        @Test 
        void test3forlab8Check() {  
            assertEquals(String.valueOf(sea.linearSearch(first, 0)), "0");
            assertEquals(String.valueOf(sea.jumpSearch(first, 10)), "-1");
            assertEquals(String.valueOf(sea.binarySearch(first, 'q')), "-1");
            
            
        }        
}
