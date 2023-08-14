/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosmoncada
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] nums = {1, 2, 3};
        generatePermutations(nums, 0);   
        }
      public static void generatePermutations(int[] nums, int startIndex) {
        if (startIndex == nums.length - 1) {
           
            printArray(nums);
            
        }
        
        for (int i = startIndex; i < nums.length; i++) {
           
            swap(nums, startIndex, i);
            
            
            generatePermutations(nums, startIndex + 1);
            
            // Undo the swap to backtrack and try the next possibility
            swap(nums, startIndex, i);
        }
    }
    
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
       // System.out.println("Temp "+temp);
        nums[i] = nums[j];
       // System.out.println("Num [i: "+i+"] "+nums[i]);
        nums[j] = temp;
    //    System.out.println("Num [j :"+j+"] "+nums[j]);
    }
    
    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+nums[i]+"");
        }
        System.out.println("");
    }
    
}
    

    
    
    
