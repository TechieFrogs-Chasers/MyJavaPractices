import javax.lang.model.util.ElementScanner14;

/*public class Ifelse{
    public static void main(String[] args){
        int X=20;
        int Y=30;
        if(X>Y){
            System.out.println("sindhu");
        }else {
            System.out.println("ram");
        }

    }
}*/

/*public class Ifelse{
    public static void main(String[] args){
        int year =2020;
        if((year%4==0 && year%400 == 0)||(year% 100!=0)){
            System.out.println("LEAP YEAR");
        } 
        else 
        {
            System.out.println("NOT A LEAP YEAR");
        }
    }
}*/


//grades
public class Ifelse{
    public static void main(String[] args){
        int marks =65;
        if(marks<=50)
        {
            System.out.println("fail");

        } 
        else if ((marks>=50)&&(marks<60))
        {
            System.out.println("D grade");

        } 
        else if((marks>=60)&&(marks<70))
        {
            System.out.println("C grade");
        }
        else if ((marks>=70)&&(marks<=80))
        {
            System.out.println("B grade");
        }
        else if ((marks>=80)&&(marks<=90))
        {
            System.out.println("A grade");
        }
        else if ((marks>=90) && (marks<=100))
        {
            System.out.println("A+ grade");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}




  
    

