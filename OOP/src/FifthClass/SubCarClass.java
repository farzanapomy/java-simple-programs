
package FifthClass;

public class SubCarClass extends Carclass {
    private float chargeInBettary;
    private String carLocation; 
    
    public SubCarClass(){
        super();
    }
    
        public SubCarClass(String manu,String model,String key, int Cc,float fl,float charge, String location){
            
            chargeInBettary =charge;
            carLocation = location;
        }
        
        public float getChargeInBattery() {
		return chargeInBettary;
	}
	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBettary = chargeInBettary;
	}


	public String getLocationString() {
		return carLocation;
	}
    @Override
        public void printAllInfo(){
            super.printAllInfo();
        
        System.out.println("final fuel :"+presentAmointOfFuel()+"L");  
        System.out.println("Charge of bettary :"+getChargeInBattery());
        System.out.println("The location is :"+getLocationString());
        }
       

   
    
}
