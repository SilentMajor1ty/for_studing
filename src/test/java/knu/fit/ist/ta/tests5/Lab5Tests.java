/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.tests5;


import knu.fit.ist.ta.lab5.Lab4Task;
import knu.fit.ist.ta.lab5.Task;
import knu.fit.ist.ta.lab5.TaskText;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author sereg
 */
@SpringBootTest
public class Lab5Tests {

    @Test

    void test1(){

        TaskText t1fl5 = new TaskText();
        Task tfl5 = new Task(5);
        Lab4Task tfl4 = new Lab4Task();
        
        String text = "a tablet hour divorce handbag bishop denim pitch ";
        
        assertEquals("position = " + 0,t1fl5.Task1("a", -1, -1, tfl4.getList(text)));
        assertEquals("position = " + 3,t1fl5.Task1("divorce", -1, -1, tfl4.getList(text)));
        assertEquals("position = " + 7,t1fl5.Task1("pitch", -1, -1, tfl4.getList(text)));
        
        assertEquals("-1",t1fl5.Task1("bishop", -1, 3, tfl4.getList(text)));
        assertEquals("-1",t1fl5.Task1("pitch", 1, 2, tfl4.getList(text)));
        
        String text2 = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        
        assertEquals("position = " + 10,t1fl5.Task1("k", 7, 13, tfl4.getList(text2)));
        assertEquals("-1",t1fl5.Task1("k", 12, 13, tfl4.getList(text2)));
        assertEquals("position = " + 23,t1fl5.Task1("x", 15, -1, tfl4.getList(text2)));
        assertEquals("-1",t1fl5.Task1("k", 24, 25, tfl4.getList(text2)));

    }

}
