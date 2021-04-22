/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.tests4;

import java.util.ArrayList;
import java.util.Arrays;
import knu.fit.ist.ta.lab4.Text;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author sereg
 */
@SpringBootTest
public class Lab4Tests {
    @Test
    void testGetCleanText() {
        Text text = new Text("Hey, man u      ");
        assertEquals(text.getCleanText(), "hey man u");
    }

    @Test
    void testGetTotalWordCount() {
        Text processor = new Text("s sdds sdl,");
        assertEquals(processor.getTotalWordCount(), 3);
    }

    @Test
    void testGetUniqueWordsCount() {
        Text text = new Text("man r u ok?");
        assertEquals(text.getUniqueWordsCount(), 4);
    }


    @Test
    void testGetWordsWithoutB() {
        Text text = new Text("Bye Bill for a now");
        assertEquals(text.getWordsWithoutB(), 3);
    }

}
