
package javaapplication12;
import java.util.Scanner;
public class digitspelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int digit;
        System.out.println("Enter the digit:");
        digit = input.nextInt();
        
        switch(digit){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Nothing is digit");
               
        }
    }
}
