/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

import org.springframework.stereotype.Component;

/**
 *
 * @author sereg
 */
@Component
public class Calculate {
    
    public static Float lab2equation(float x) {
        float a = -2;
        float b = 6;
        float c = 3;
        float d = 2;
        
        double y1 = Math.sqrt(d * x);
        double y2 = a * Math.pow(x,2) + b * x + c;
        if (((y1 / y2)<= 0.000001) && ((y1 / y2) >= 0)){return (float) 0;}
        else if (((y1 / y2) >= -0.000001 ) && ((y1 / y2) <= 0)) {return (float) 0;}
        else return (float) (y1 / y2);
        
    }

    public short calculate(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public short solve(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public short equation(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public short equation(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
