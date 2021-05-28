/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.tests67;


import knu.fit.ist.ta.lab67.Check;
import knu.fit.ist.ta.lab67.Regression;
import knu.fit.ist.ta.lab67.Tree;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author sereg
 */
@SpringBootTest
public class Lab67Tests {

    @Test 
        void testforlab6_7Check(){
        
            
            Tree tr = new Tree();
            Check ch = new Check();
            
            tr.add(7);
            tr.add(1);
            tr.add(5);
            tr.add(3);
            tr.add(10);
            tr.add(2);
            tr.add(8);
            tr.add(9);
            
            assertEquals("0",ch.showResult(""+15));
            assertEquals("2",ch.showResult(""+ 223));
            assertEquals("Please enter a number",ch.showResult(""));       
            assertEquals("3",ch.showResult(""+ 160002122));
            
            assertEquals(false,tr.containsNode(15));
            assertEquals(true,tr.containsNode(10));
            assertEquals(true,tr.containsNode(5));
            assertEquals(false,tr.containsNode(0));
            assertEquals(false,tr.containsNode(11));
            assertEquals(true,tr.containsNode(3));
        }
    }

