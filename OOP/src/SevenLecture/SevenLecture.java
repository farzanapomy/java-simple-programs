
package SevenLecture;

import java.util.Scanner;

public class SevenLecture {
    private static OurThread thread1 = new OurThread("Child 1",0,1,500,true);
    private static OurThread thread2 = new OurThread("Child 2",100,10,1000,true);
    private static OurThread thread3 = new OurThread("Child 3",1000,100,2000,true);
    
    static Scanner myScanner= new Scanner(System.in);
    public static void main(String[] args) {
         
       
        
        thread1.start();thread2.start();thread3.start();
        
        System.out.println("Plase Write a coomand : ");
        String commandString=myScanner.nextLine();
        
        while (!commandString.toLowerCase().equals("Exit")) {
            if (commandString.equals("1")) {
                System.out.println("Counter in thread 1 :" + thread1.getCounter());
                threadStatus();
            } else if (commandString.equals("2")) {
                System.out.println("Counter in thread 2 :" + thread2.getCounter());
                threadStatus();
            } else if (commandString.equals("3")) {
                System.out.println("Counter in thread 3 :" + thread3.getCounter());
                threadStatus();
            } else if (commandString.equals("1s")) {
                thread1.stopThread();
                System.out.println("Thread 1 stoped");
                threadStatus();
            } else if (commandString.equals("2s")) {
                thread2.stopThread();
                System.out.println("Thread 2 stoped");
                threadStatus();
            } else if (commandString.equals("3s")) {
                thread3.stopThread();
                System.out.println("Thread 3 stoped");
                threadStatus();
            } else {
                System.out.println("Please give  a proper command: ");
                threadStatus();
            }
        commandString=myScanner.nextLine();
        } 
    }
    private static void threadStatus() {
        System.out.println("Thread 1 is alive" + thread1.isAlive());
        System.out.println("Thread 2 is alive" + thread2.isAlive());
        System.out.println("Thread 3 is alive" + thread3.isAlive());
    }
    
}
