
package FifthClass;

public class LearingClass {
     public Carclass ourCar;
   static public Carclass ouranotherclass;
   static public SubCarClass ourSubClass;
   

    public static void main(String[] args) {
        
       ouranotherclass = new Carclass("ToyoTa","Tesla","black","Hello",1000,30);
       System.out.println("Our Manufecture Name:"+ouranotherclass.carMenufectureName);
       System.out.println(ouranotherclass.getModelName()+"Our car name is :"); 
        System.out.println("Car color :"+ouranotherclass.carColor);
       System.out.println("Pass is :"+ouranotherclass.matchPass("hflsd"));
        System.out.println("Fuel :"+ouranotherclass.presentAmointOfFuel());
        System.out.println("Fuel 2"+ouranotherclass.presentAmointOfFuel());
        
        System.out.println("fuel amount :"+ouranotherclass.presentAmointOfFuel()+"L");
        ouranotherclass.addfuel(2);
        System.out.println("fuel amount after driving :"+ouranotherclass.presentAmointOfFuel());
       
       ouranotherclass.runforSecond(60);
        System.out.println("final fuel :"+ouranotherclass.presentAmointOfFuel()+"L");
        System.out.println("\n \n");
        
        Carclass secondcar= new Carclass("Mazda","Alien","dark blue","qrstg",1200,50);
         
        System.out.println("Our Manufecture Name:"+secondcar.carMenufectureName);
       System.out.println(secondcar.getModelName()+"Our car name is :"); 
        System.out.println("Car color :"+secondcar.carColor);
       System.out.println("Pass is :"+secondcar.matchPass("hflsd"));
        System.out.println("Fuel :"+secondcar.presentAmointOfFuel());
        System.out.println("Fuel 2"+secondcar.presentAmointOfFuel());
        System.out.println("fuel amount :"+secondcar.presentAmointOfFuel()+"L");
        secondcar.addfuel(2);
        System.out.println("fuel amount after driving :"+secondcar.presentAmointOfFuel());
       secondcar.runforSecond(60);
        System.out.println("final fuel :"+secondcar.presentAmointOfFuel()+"L");  
        System.out.println("|\n \n");
        
        
        Carclass Thirdclass = new Carclass("BMW","7 Series ","gray","hies",2500,40);
        Thirdclass.printAllInfo();
        
       // ourSubClass.carMenufectureName
          
       
       
    }
    
}
