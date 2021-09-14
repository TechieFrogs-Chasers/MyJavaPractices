package JavaPrograms;
import javax.lang.model.util.ElementScanner14;

public class ControlSwitchExamp {
    
    public static void main(String[] args) {

int age = 25;
int wei =60;
String mounika ="Mounika";
        int j= age++;
       switch (mounika){

              case "Madhu": 
              if(age>=18 || wei>=60){
                System.out.println("Madhu "+j+" "+wei);
              }
               else 
                    System.out.println("Not eligible");

                case "Mounika": 
                if(age>=25 && wei>=60){
                    System.out.println("Matched");
                
                break;
                }
                default:System.out.println("Invalid");
                {
                    System.out.println(age++);
                }





        }




        
    }
}
