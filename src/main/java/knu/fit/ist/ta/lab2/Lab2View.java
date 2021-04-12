/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab2;

/**
 *
 * @author sereg
 */
public class Lab2View {
    
    public String showResult(String xString){
        Float x = Float.parseFloat(xString);
        return Calculate.lab2equation(x).toString();
        
    }
}
