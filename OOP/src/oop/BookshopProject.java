
package oop;
import java.util.Scanner;

public class BookshopProject {
    static Scanner mychoice= new Scanner(System.in);
    
    static String[] books= {"Java","C programming","python"};
    static final double teacherdiscount =.3;
    static final double studentdiscount =.4;
    static final double aliendiscound =.0;
    public static void main(String[] args){
         String userchoice;
        prln("......Wellcome to Our bookstore");
        prln("Please entre the name of which book do you want?");
        
        userchoice= mychoice.nextLine();
        if(books[0].toLowerCase() .equals(userchoice.toLowerCase() )){
            prln("your opted for "+books[0]+"Book.");
            calculatePrice(books[0]);
        }else if(books[1].toLowerCase() .equals(userchoice.toLowerCase())){
            prln("You opted for "+books[1]+"Book.");
            calculatePrice(books[1]);

        }else if(books[2].toLowerCase() .equals(userchoice.toLowerCase())){
            prln("You opted for "+books[2]+"Book.");
            calculatePrice(books[2]);

        }else{
            prln("Sorry !! we don't have that book. " );
        }
     
    }
    
    static void calculatePrice(String bookName){
        prln("Are you student , teacher, alien?\nans: ");
        String answer= mychoice.nextLine();
        double price = 200;
        if(answer.toLowerCase().equals("teacher")){
           price= price-(price*teacherdiscount);
          showprice(price); 
        }else if(answer.toLowerCase().equals("student")){
            price= price-(price*studentdiscount);
            showprice(price);
        }else if(answer.toLowerCase() .equals("alien")){
            price= price-(price*aliendiscound);
            showprice(price);
        }else {
            prln("sorry..We can't surve you" );
        }
        
    }
    
    static void showprice(double price){
        prln("Your total payable amount:"+price);
        prln("\n--------THANK YOU FOR SHOPPING FROM OUR BOOKSTORE-----\n");
        
    }
    
    static void prln(Object anyobject){
        System.out.println(anyobject);
    }
    static void pr(Object anyobject){
        System.out.println(anyobject);
    }
}
