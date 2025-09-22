package module4;

import java.util.Scanner;
public class module4 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	     
	        int count = 0;
	        double total = 0;
	        double max = 0;
	        double min = 0;
	        double value;
	        
	        while (count < 5) {
	        	System.out.print("Enter a number: ");
	             value = input.nextDouble();
	             
	             total = total + value;
	             
	             
	             if (count == 0) {
	            	 max = value;
	            	 min= value;
	             }
	             
	             if (value > max) {
	            	 max = value;
	             }
	             if (value < min) {
	            	 min = value;
	             }
	             ++ count;
	        }
	        
	        
	        double average = total / 5;
	        double interest = total * 0.20;
	        

	        System.out.println("Here are the stats of your 5 numbers");
	        System.out.println("Total: " + total);
	        System.out.println("Average: " + average);
	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);
	        System.out.println("Interest on total at 20%: " + interest);
	        
	        
	 }
}
