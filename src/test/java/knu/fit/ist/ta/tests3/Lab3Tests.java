/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.tests3;




import knu.fit.ist.ta.lab3.Array;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 *
 * @author sereg
 */
@SpringBootTest


public class Lab3Tests {
   @Test
   void test() {
       Array array = new Array();
       int[] a={7,4,1,0,10};
        assertEquals("" + 0,array.func(a));        
        }
}

