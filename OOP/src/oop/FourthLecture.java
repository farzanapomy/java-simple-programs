
package oop;
import java.util.Scanner;
public class FourthLecture {
    static Scanner myScanner= new Scanner(System.in);

    public static void main(String[] args){
      
        int[][] twoDarray = new int[2][4];
        
        /*prln("Enter your input:");
        
        for( int row = 0; row<2 ; row++){
            for( int column = 0; column <4 ; column++ ){
                pr("twoDarray["+row+"]["+column+"] : ");
                twoDarray[row][column]= myScanner.nextInt();
            }      
        }
        
        for( int row =0; row < 2; row++){
            for( int column = 0 ; column<4 ;column++){
               
                pr(twoDarray[row][column]+"\t");
            }
             
            prln("\n");
        }*/
        
        pr("Please give a number :");
        double userInput =myScanner.nextDouble();
        while(userInput!=200){
            prln((100/userInput));
            pr("Please gove a number :");
          userInput =myScanner.nextInt();
        }
                   

        
    }
   
    
    static void prln(Object anyobject){
        System.out.println(anyobject);
    }
    static void pr(Object anyobject){
        System.out.print(anyobject);
    }
   
}
    
    


 

