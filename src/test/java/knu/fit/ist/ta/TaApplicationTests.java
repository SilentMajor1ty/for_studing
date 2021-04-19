package knu.fit.ist.ta;

import knu.fit.ist.ta.lab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaApplicationTests {
    
    @Autowired
    Calculate calculate;

	@Test
	void contextLoads() {
	}
        
        @Test
        void testforlab2(){
        assertEquals(0,Calculate.lab2equation(0));
        assertEquals((float) 0.20203051,Calculate.lab2equation(1));
        
        }

}
