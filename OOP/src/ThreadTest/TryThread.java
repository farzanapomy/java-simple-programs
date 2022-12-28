
package ThreadTest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TryThread {
    public static void main(String[] args ){
        
        for (int i = 1; i < 10; i++) {
            try {
                System.out.println(1);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TryThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
       
    }   
     class A extends Thread{
        
    }
    
}
