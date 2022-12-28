
package FifthClass;

public class Carclass {
    public String carMenufectureName;
    public String modelName;
    public String carColor;
    public int engineCC;
    private final String carKeyvalue;
     private  float fuelAmount;
     final private float amountofFuelconsumedpersecond=0.02f;
             
     protected int manufectureYear;
     
      public Carclass( ){
    carMenufectureName =new String();
     modelName = new String();
     engineCC = 0;
     carKeyvalue = new String();
     carColor=new String();
     fuelAmount=0;
    }

    public Carclass(String menu ,String model,String color,String pass, 
        int CC,float fuel ){
    carMenufectureName = menu;
     modelName = model;
     engineCC = CC;
     carKeyvalue = pass;
     carColor=color;
     fuelAmount=fuel;
     manufectureYear=0;
    }
    public Carclass(String menu ,String model,String color,String pass, 
        int CC,float fuel, int year){
        this();
        manufectureYear=year;
        
    }

    

    public float presentAmointOfFuel(){
        return fuelAmount;
    }
    
    public String getMenufectureName(){
        return carMenufectureName;
    }
    
    public String getModelName(){
        return modelName;
    }
    public void addfuel(float fuelAmount){
        this.fuelAmount+=fuelAmount;
    }
    public void runforSecond(int time){
        float usedfuel=time*amountofFuelconsumedpersecond;
        fuelAmount-= usedfuel;
    }
 
    public boolean matchPass(String userInput){
        return userInput.equals(carKeyvalue) ;
    }
    
     public void printAllInfo(){
            System.out.println("Our Manufecture Name:"+carMenufectureName);
       //System.out.println("Our car name is :"+getModelName); 
        System.out.println("Car color :"+carColor);
       System.out.println("Pass is :"+matchPass("hflsd"));
        System.out.println("Fuel :"+presentAmointOfFuel());
        System.out.println("Fuel 2"+presentAmointOfFuel());
        System.out.println("fuel amount :"+presentAmointOfFuel()+"L");
        addfuel(2);
        System.out.println("fuel amount after driving :"+presentAmointOfFuel());
       runforSecond(60);
        System.out.println("final fuel :"+presentAmointOfFuel()+"L");  
        }
    
    
}
