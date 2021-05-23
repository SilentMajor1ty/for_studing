/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author sereg
 */
public class Lab4Task {
    public String text;
    Matcher mat;
    
    public Lab4Task(){
    
        text = "The internet of things, or IoT, is a system of interrelated computing devices, mechanical and digital machines, objects, animals or people that are provided with unique identifiers (UIDs) and the ability to transfer data over a network without requiring human-to-human or human-to-computer interaction."
                + "A thing in the internet of things can be a person with a heart monitor implant, a farm animal with a biochip transponder, an automobile that has built-in sensors to alert the driver when tire pressure is low or any other natural or man-made object that can be assigned an Internet Protocol (IP) address and is able to transfer data over a network."
                + "Increasingly, organizations in a variety of industries are using IoT to operate more efficiently, better understand customers to deliver enhanced customer service, improve decision-making and increase the value of the business.How IoT works?An IoT ecosystem consists of web-enabled smart devices that use embedded systems, such as processors, sensors and communication hardware, to collect, send and act on data they acquire from their environments."
                + "IoT devices share the sensor data they collect by connecting to an IoT gateway or other edge device where data is either sent to the cloud to be analyzed or analyzed locally. Sometimes, these devices communicate with other related devices and act on the information they get from one another. The devices do most of the work without human intervention, although people can interact with the devices -- for instance, to set them up, give them instructions or access the data."
                + "Why IoT is important?The internet of things helps people live and work smarter, as well as gain complete control over their lives. In addition to offering smart devices to automate homes, IoT is essential to business. IoT provides businesses with a real-time look into how their systems really work, delivering insights into everything from the performance of machines to supply chain and logistics operations";

        text = cleanString(text);
    }
    
    private String cleanString(String input){
        input = input.toLowerCase();
        input = input.replaceAll("-{2,}","");
        input = input.replaceAll(" {2,}"," ");
        input = input.replaceAll("[^\\w -]", "").trim();       
    return input;
    } 

    public List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }

    public Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }

    public String Task4(List<String> result, int n, int b){
    
        List<String> answerList = new ArrayList<String>();
        int[] numberOfWords = new int[result.size()];
        
        for (int j = 0; j < result.size(); j++){
        
            String pattern = "";
            if (b == 1)
                pattern = "\\b" + result.get(j).replace("-", "\\-")  + "+\\b";
            else 
                pattern = result.get(j).replace("-", "\\-")  + "+";
            
            List<String> answerLine = new ArrayList<String>();
            mat = Pattern.compile(pattern).matcher(text);
        
            while (mat.find()){
                answerLine.add(text.substring(mat.start(), mat.end()));
            }
            
            numberOfWords[j] = answerLine.size();
            answerList.add(result.get(j));
            //System.out.println(numberOfWords[j] + " " + answerList.get(j));
        }
        
        String res = "";
        int i = 1;
        
        while (i <= n) {
        
            int max = 0;
            int maxid = 0;
        
            for (int j = 0; j < result.size(); j++){
            
                if (max <= numberOfWords[j]){
                
                    maxid = j;
                    max = numberOfWords[j];
                    //System.out.println(numberOfWords[j] + " " + answerList.get(j));
                    numberOfWords[j] = 0;
                }
            }
            res += i + ": " + answerList.get(maxid) + " = " + max + " | ";
            i++;
        }
        
        return res;  
    }
    
    public String Task5(String line, String l) {
    
        line = line.replaceAll("-", "");
        //List<String> answerLine = getList(line);
        List<String> answerLine = new ArrayList<String>();
        String pattern = l;
        
        mat = Pattern.compile("[a-z]*" + l + "[a-z]*").matcher(line);
        
        while (mat.find()){
            answerLine.add(line.substring(mat.start(), mat.end()));
        }
        
        return "" + (getList(line).size() - answerLine.size());
    }
    
    public String Task6(String line, int n){
    
        line = line.replaceAll("-", "");
        List<String> result = getList(line);
        int answerLine = 0;
        
        for (int j = 0; j < result.size(); j++){
            
            String letters = result.get(j);
            Set<String> resLetters = new HashSet<>();
            
            for (int i = 0; i < letters.length(); i++){
                
                resLetters.add("" + letters.charAt(i));
            }
            if (resLetters.size() == n)
                answerLine++;
            //System.out.println(resLetters.size() + " " + letters + " " + resLetters);
        }
        return "" + answerLine;
    }
    
    public String Task7(List<String> result, int n){
    
        List<String> resLetters = new ArrayList<String>();
        
        for (int j = 0; j < result.size(); j++){
            
            String letters = result.get(j);
            
            for (int i = 1; i < (letters.length() - 1); i++){
                
                resLetters.add("" + letters.charAt(i - 1) + letters.charAt(i) + letters.charAt(i + 1));
            }
        }
        
        return Task4(resLetters, n, 0);
    }
}
