/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

import java.util.*;
import java.io.*;
/**
 *
 * @author brandonhyppolite
 */
public class DataAnalyzerTester {
    
    /**
     * The main sequence. Creates a file that user can name. Asks for a set of
     * numbers, stores it in the file, computes the min, max, and average of the
     * set, and writes those values into the file.
     * @param args 
     */
    public static void main(String[] args){
        try {
            LinkedList<Integer> numList = new LinkedList<Integer>();
            int num;
        
            Scanner sc = new Scanner(System.in);
        
            String fileName;
        
            System.out.println("Enter the name of the file for storing the numbers");
            fileName = sc.nextLine();
        
            File createfile = new File(fileName);
            createfile.createNewFile();
        
            FileWriter writer = new FileWriter(createfile);
        
            System.out.println("\n Start entering numbers (0 to stop): \n\n");
            
            num = sc.nextInt();
            
            while (num != 0){
                writer.write(num + "\n");
                numList.add(num);
                num = sc.nextInt();
            }
            
            DataAnalyzer da = new DataAnalyzer(numList);
            
            System.out.println("\n Minimum value: " + da.min());
            writer.write("\n Minimum value: " + da.min());
            
            System.out.println("\n Maximum value: " + da.max());
            writer.write("\n Maximum value: " + da.max());
            
            System.out.println("\n Average value: " + da.average() + "\n");
            writer.write("\n Average value: " + da.average() + "\n");
            
            writer.flush();
            writer.close();
            
            sc.close();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
