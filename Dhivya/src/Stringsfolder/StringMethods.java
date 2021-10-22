package Stringsfolder;

public class StringMethods {
    public static void main(String[] args) {
        int num = 100;
    String str = "500";
    int num2 = Integer.parseInt(str);
    int num3  = Integer.valueOf(str);
    int sum = num+num2;
    int sum2  = num+num3;
    System.out.println("The sum is :" +sum +" "+ sum2);
    String strin = "11111";
       String str2 = "88888";
       //Conversion using valueOf(String) method
       long number= Long.valueOf(strin);
       long number2 = Long.valueOf(str2);
       System.out.println(number+number2);	
       char ch = 'd';
       String g = String.valueOf(ch);
       String g1= Character.toString(ch);
       System.out.println("the value of ch now: "+ g + ","+ g1);
       int arrayOfNo[] = {65, 120, 98, 75, 115};
        String stringValue =null;
        for(int i:arrayOfNo){
            stringValue = Character.toString((char)i);
            System.out.println(stringValue);
           
        }
        StringBuffer sb = new StringBuffer("hello team");
        System.out.println(sb.reverse());
    }
}
    
    
