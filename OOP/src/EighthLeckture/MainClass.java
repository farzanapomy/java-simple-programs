package EighthLeckture;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner  myScanner=new Scanner(System.in) ;
        
        CustomeRunnableObject firstObject = new CustomeRunnableObject("FIRST", 0);
        CustomeRunnableObject secondObject = new CustomeRunnableObject("SECOND", 200);
        CustomeRunnableObject thirdObject = new CustomeRunnableObject("THIRD", 10000);
        //CustomeRunnableObject fourthObject = new CustomeRunnableObject("FOURTH ", 5000);
        
        Thread firstThread = new Thread(firstObject);
        Thread secondThread = new Thread(firstObject);
        Thread thirThread= new Thread(firstObject);
        Thread fouThread = new Thread(firstObject);
        
        
           String commandString=myScanner.nextLine();
        
        while (!commandString.toLowerCase().equals("Exit")) {
            if (commandString.equals("1")) {
                System.out.println("Counter in thread 1 :" + firstObject.getCounter());
                //threadStatus();
            } else if (commandString.equals("2")) {
                System.out.println("Counter in thread 2 :" + secondObject.getCounter());
                //threadStatus();
            } else if (commandString.equals("3")) {
                System.out.println("Counter in thread 3 :" + thirdObject.getCounter());
                //threadStatus();
            } else if (commandString.equals("1s")) {
                firstThread.interrupt();
                System.out.println("Thread 1 stoped");
                //threadStatus();
            } else if (commandString.equals("2s")) {
                secondThread.interrupt();
                System.out.println("Thread 2 stoped");
                //threadStatus();
            } else if (commandString.equals("3s")) {
                thirThread.interrupt();
                System.out.println("Thread 3 stoped");
                //threadStatus();
            } else {
                System.out.println("Please give  a proper command: ");
                //threadStatus();
            }
        
        
        
        
    }
         
    } 
    
}
