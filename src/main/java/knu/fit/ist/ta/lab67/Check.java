/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

/**
 *
 * @author sereg
 */

public class Check {
    public String showResult(String n){
        if(n.equals("")){return "Please enter a number";}
        if(n.matches("[-+]?\\d+"))
        {
        int x = Math.abs(Integer.parseInt(n));
        return "" + Regression.numberOf2s(0, x);
        }
        else{
            return "It must be a number";
        }
        
    }
}
