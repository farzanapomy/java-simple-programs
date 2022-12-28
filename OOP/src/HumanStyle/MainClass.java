
package HumanStyle;

public class MainClass {
    
   public StyleOfhuman pomy;
    public StyleOfhuman Rimy;
    public StyleOfhuman Anny;
    
    
    public static void main(String[] args){
        
        StyleOfhuman anny = new StyleOfhuman("Anny","Commerce College",30,58.54f);
        
        System.out.println("First user name = "+anny.humanname);
        System.out.println("First user name = "+anny.studyPlace());
        System.out.println("First user name = "+anny.getWeight());
        System.out.println("First user name = "+anny.humanage);
        
        System.out.println("\n");
        
      StyleOfhuman pomy = new StyleOfhuman("Pomy","Port city",23,50.54f);
      
        System.out.println("First user name = "+pomy.humanname);
        System.out.println("First user name = "+pomy.studyPlace());
        System.out.println("First user name = "+pomy.getWeight());
        System.out.println("First user name = "+pomy.humanage);
        
        System.out.println("\n");
        
       StyleOfhuman rimy = new StyleOfhuman("Rimy","CU",21,52.54f);
       System.out.println("First user name = "+rimy.humanname);
        System.out.println("First user name = "+rimy.studyPlace());
        System.out.println("First user name = "+rimy.getWeight());
        System.out.println("First user name = "+rimy.humanage);
        
    }
   
    
}
