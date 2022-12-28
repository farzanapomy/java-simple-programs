
package oop;
import java.util.Scanner;
class PascalTringle {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args){
        prln("Give -1 to exit ");
        pr("Give the length of Pascal's Tringles length :");
        int userinput = myScanner.nextInt();
        while(userinput!=-1){
            if(userinput<=-1){
            prln("Please enter something between -1 to 20");
            userinput=myScanner.nextInt();
           
        }
            
        printpascalTringle(userinput);
        prln("\n\n");
        
                prln("Please enter something between -1 to 20");
            userinput=myScanner.nextInt();
    }
    
    }   
    
     static void printpascalTringle(int length){
         int[][] pascal = new int[length][length];
         for(int i=0; i<length; i++){
             pascal[0][i]=1;
             pascal[i][0]=1;
         }
         for(int row =1 ; row<length ; row++){
             for(int column =1 ; column<length-row ; column++){
             pascal[row][column]=pascal[row][column-1]+pascal[row-1][column];
                 
             }
          
       } 
         for(int row =0 ; row<length ;row++){
             for(int column =0 ; column<length-row ; column++){
             pr(pascal[row][column]+"\t");
            }
           prln("\n\n");
          
        
    }
         
     }
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    static void pr(Object anyObject){
        System.out.print(anyObject);
    }
}
