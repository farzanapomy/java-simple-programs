
package javaapplication12;
import java.util.Scanner;

public class AreaOfTraingle {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
      
       double area, redius ;
       System.out.println("Enter the redius of circle");
       redius = input.nextDouble();
       
        area = 3.1416 * redius * redius;
        System.out.println("The area is = "+area);
    
    }
    
   
   
}
