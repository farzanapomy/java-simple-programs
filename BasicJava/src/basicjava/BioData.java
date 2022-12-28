package basicjava;
import java.util.Scanner;
public class BioData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter your name :");
        name = input.nextLine();
        System.out.println("Well come ="+name);
    }
   
}
