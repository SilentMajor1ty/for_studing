/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab8;

/**
 *
 * @author sereg
 */
public class Check {
    public String showFinal(String n){
        if(n.equals("")){return "" + 0;}
        if(n.matches("[-+]?\\d+"))
        {
        return "" + Integer.parseInt(n);
        }
        else{
            return ""+0;
        }
        
    }
}
