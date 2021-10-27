package Assignment5;
import java.util.concurrent.atomic.DoubleAccumulator;

import javax.lang.model.util.ElementScanner14;

public class Stringisnumeric {
     static boolean isStringNumeric(String number){ //boolean is a return type  
              boolean isNumeric;
              if (number==null){
              isNumeric=false; 
              }
              else
              {
              try 
              {
                  Double num = Double.parseDouble(number);
                  isNumeric=true;
              }  
              catch (NumberFormatException e)  //numberforamtexception means in num we have spaces or digits
              {
                  isNumeric=false;
              } 

              }
              return isNumeric;
        
     }
     public static void main(String...args){
         String num="101";
         String num2=" 101";
         // if we call a method in static reference we need to give a static to that method 
         System.out.println("given number : "+num +"is num is numeric:"+isStringNumeric(num)); 
     }
    
}
