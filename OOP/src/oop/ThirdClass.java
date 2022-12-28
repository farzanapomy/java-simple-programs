
package oop;
import java.util.Scanner;
public class ThirdClass {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myname;
        myname= "ABCD";
        System.out.println(myname);
        pr("this is oir new mwthod");
        prln(myname);
        prln("The number of characters :"+myname.length());
        
        int[][] twoDarray= new int[2][2];
       prln("Enter the dimension");
       
        twoDarray[2][2]= input.nextInt();
        
        //twoDarray[0][0]=1;
        //twoDarray[0][1]=2;
        
       // twoDarray[1][0]=4;
        //twoDarray[1][1]=6;
        
        twoDarray[1][0]+=(twoDarray[0][0]+twoDarray[0][1]);
        prln(twoDarray[1][0]);
        
        if(twoDarray[1][0] <14){
       
            System.out.println("this is too short");;
        }
        
    }
    
   //1 2
   //4 6

static void prln(Object anyobject){
    System.out.println(anyobject);
}

static void pr(Object anyobject){
    System.out.println(anyobject);
}
}