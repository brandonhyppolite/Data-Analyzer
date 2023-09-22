/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

import java.util.LinkedList;

/**
 * class that calculates the minimum, maximum, and average in the linked list
 * @author brandonhyppolite
 */
public class DataAnalyzer {
    
    /**
     * stores the this of numbers in the linked list
     * @param numList holds the values inside the linked list
     * that will be used.
     */
    public DataAnalyzer(LinkedList<Integer> numList){
        nums = numList; 
    }
    
    /**
     * finds the minimum value inside the linked list
     * @return the min number
     */
    public int min(){
        if (nums.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
   
        int min = nums.get(0);
        for (int i=0; i < nums.size(); i++){
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return min;
    }
    
    /**
     * finds the maximum number in the list
     * @return the max number
     */
    public int max(){
        int max = nums.get(0);
        for(int t = 0; t < nums.size(); t++) {
            if (nums.get(t) > max) {
                max = nums.get(t);
            }
        }
        return max;
    }
  
    /**
     * calculates the average of the list
     * @return the average number
     */
    public double average(){
        double avg;
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);   
        }
        avg = (double) sum/nums.size();
        return avg;
    }
    public LinkedList<Integer> nums;
}
