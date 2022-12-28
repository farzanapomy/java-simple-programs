
package HumanStyle;


public class StyleOfhuman {
    
    public String humanname;
    public int humanage;
    private final float humanweight;
    public String education;
    
    
    public StyleOfhuman(String name, String study, int age , float weight){
        
        humanname = name;
        humanage = age;
        humanweight = weight;
        education = study;
    }
    
    
    
    public void sleepingMethode(){
        System.out.println("This human can sleep");
    }
    
    public String studyPlace(){
        return education;
    }
    public float getWeight(){
        return humanweight;
    }
    
}
