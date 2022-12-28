
package oop;
import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
       char[] cards= {'P','O','M','Y'};
       //int first = 5 , second =7;
         Scanner input = new Scanner(System.in);
        String name;
         
        System.out.println("Enter your name :");
        name= input.nextLine();
        System.out.println("Hello "+name);
        System.out.println(cards[2]);
        boolean result = prokriya(5,7);
        System.out.println("The result is "+result);
       
        System.out.println("Enter the number");
        int firstnumber = input.nextInt();
        int result2 =prokriya2(firstnumber);
        System.out.println("The reult is "+result2);
        
    }
    public static boolean prokriya(int first , int second) {
       boolean ans = first>second; 
     return ans;
}
    
    static int prokriya2(int firstnumber){
         firstnumber*=200;
        return firstnumber;
    }
}
