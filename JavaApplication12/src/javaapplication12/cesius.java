
package javaapplication12;

import java.util.Scanner;
class cesius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double celsius , fahrenhit;
        System.out.println("Enter the fahrenhit :");
        
        fahrenhit = input.nextDouble();
        celsius = 1.8*fahrenhit - 32;
        
        System.out.println("This celsious is :"+celsius);
    }
    
}
