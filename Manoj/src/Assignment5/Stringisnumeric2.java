package Assignment5;
public class Stringisnumeric2 {
    public static void main(String...args){
        String num="4 5";
        boolean isnumeric=true;
        isnumeric=num.matches("-?\\d+(\\.\\d+)?");//here we using regex method regular expression
     /*   try{
            Double d =Double.parseDouble(num);//parsing is the best way to tell the string is numeric
        }
        catch(NumberFormatException ex){
             isnumeric=false;
        }*/
        if(isnumeric){
            System.out.println("its a numeric value");
        }
        else{
            System.out.println("its not a numeric one");
        }
    }
    
}
