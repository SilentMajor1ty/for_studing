/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sereg
 */
public class Task {
    private List<Integer> unsortedList;
    private Random rnd = new Random(1);
    private List<String> stringlist;
    private List<Byte> bytelist;

    public List<String> getUnsortedStringList() {
        return stringlist;
    }
    
    public List<Byte> getUnsortedByteList() {
        return bytelist;
    }
    
    public List<Integer> mergeLists(List<Integer> inputList1, List<Integer> inputList2) {
        List<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < inputList1.size() || i2 < inputList2.size()) {
            if (!(i1 < inputList1.size())) {
                result.add(inputList2.get(i2));
                i2++;

            } else if (!(i2 < inputList2.size())) {
                result.add(inputList1.get(i1));
                i1++;
            } else {
                if (inputList1.get(i1) <= inputList2.get(i2)) {
                    result.add(inputList1.get(i1));
                    i1++;

                } else {
                    result.add(inputList2.get(i2));
                    i2++;

                }

            }
        }

        return result;
    }
    
    public List<Integer> getUnsortedList() {
        return unsortedList;
    }
    
    public List<Integer> sortApproach3() {

        int p, q, r, t;

        List<Integer> result = new ArrayList<>();
        result.addAll(unsortedList);

        int n = result.size() - 1;

        int k = 1;

        while (k < n) {
            List<Integer> tempList = new ArrayList<>();
            t = 0;
            while (t < n+1) {
                p = t;
                q = t + k;
                if (q > n + 1) {
                    q = n + 1;
                }
                r = t + 2 * k;
                if (r > n + 1) {
                    r = n + 1;
                }
                t = r;

               
                tempList.addAll(mergeLists(result.subList(p, q), result.subList(q, r)));
                

            }

            result = tempList;

            k *= 2;
        }

        return result;
    }

    public Task(int arrayLength) {

            String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

            this.stringlist = new ArrayList<>();
            for (int i = 0; i < arrayLength; i++) {
                stringlist.add("" + a.charAt(rnd.nextInt(52)));
            }
            
            this.bytelist = new ArrayList<>();
            for (int i = 0; i < arrayLength; i++) {
                int b = rnd.nextInt(Byte.MAX_VALUE * 2) - Byte.MAX_VALUE;
                bytelist.add(Byte.parseByte(Integer.toString(b)));
            }

    }
    
   
    public List<String> sortApproach2String() {

        String s;
        int t; 

        List<String> result = new ArrayList<>();
        result.addAll(stringlist);

        int n = 0;
        int k = result.size() - 1;
        int arrsize = result.size() - 1;
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int index1=0;
        int index2=0;
        
        while (k != n) {
            t = k - 1;
                   
            index1=a.indexOf(result.get(t));
            index2=a.indexOf(result.get(t+1));
            while (t < arrsize && index1 > index2) {
                s = result.get(t);
                result.set(t, result.get(t + 1));
                result.set(t + 1, s);
                t++;
                index1=a.indexOf(result.get(t));
                if (t+1<=arrsize){
                    index2=a.indexOf(result.get(t+1));
                }
            }

            k--;

        }

        return result;
    }
    
    public List<Byte> sortApproach2Byte() {

        int t;
        Byte s; 

        List<Byte> result = new ArrayList<>();
        result.addAll(bytelist);

        int n = 0;
        int k = result.size() - 1;
        int arrsize = result.size() - 1;

        while (k != n) {
            t = k - 1;

            while (t < arrsize && result.get(t) > result.get(t + 1)) {
                s = result.get(t);
                result.set(t, result.get(t + 1));
                result.set(t + 1, s);
                t++;
            }

            k--;

        }

        return result;
    }
    
 
    public String Task3String(String find, List<String> sortedList){
    
        int findid = 0;
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < a.length(); i++)
            if (("" + a.charAt(i)).equals(find))
                findid = i;
        
        int result = -1;
        int start = 0;
        int n = sortedList.size() - 1;
        while (n > 1) {

            if (start + n > sortedList.size()) {
                start--;
            }
            n = (n + 1) / 2;
            
            int listid = 0;
            for (int i = 0; i < a.length(); i++)
                if (sortedList.get(n+start).equals("" + a.charAt(i)))
                    listid = i;
                        
            //System.out.println(findid + " | " + find + " | " + listid + " | " + sortedList.get(n + start));
            
            if (sortedList.get(n + start).equals(find)) {
                return "position = " + (start + n);
            } else if (listid < findid) {
                start = start + n;
            }

        }

        return "" + result;
    }
     
    public String Task3Byte(Byte find, List<Byte> sortedList){
    
        //System.out.println(find);
        int result = -1;
        int start = 0;
        int n = sortedList.size() - 1;
        while (n > 1) {

            if (start + n > sortedList.size()) {
                start--;
            }
            n = (n + 1) / 2;

            //System.out.println(find + " | " + sortedList.get(n + start).byteValue());
            if (sortedList.get(n + start).byteValue() == find) {
                return "position = " + (start + n);
            } else if (sortedList.get(n+start).byteValue() < find) {
                start = start + n;
            }

        }

        return "" + result;
    }
}
