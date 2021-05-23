/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.List;

/**
 *
 * @author sereg
 */
public class TaskText {
    public String Task1(String find, int start, int finish, List<String> list){
    
        if (start == -1)
            start = 0;
        if (finish == -1)
            finish = list.size();
        
        int result = -1;

        for (int i = start; i < finish; i++) {
            if (list.get(i).equals(find)) {
                return "position = " + i;
            }
        }
        
        return "" + result;
    }
    
    public String Task1Reverse(String find, int start, int finish, List<String> list){
    
        if (start == -1)
            start = 0;
        if (finish == -1)
            finish = list.size();
        
        int result = -1;

        for (int i = finish; i >= start; i--) {
            //System.out.println(list.get(i) + " | " + find);
            if (list.get(i).equals(find)) {
                return "position = " + i;
            }
        }
        return "" + result;
    }
}
