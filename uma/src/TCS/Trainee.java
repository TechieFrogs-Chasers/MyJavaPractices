import java.util.Scanner;

public class Trainee{
    

    String trainee1 , trainee2 ,trainee3 ;
    int i=3;

    public static void main(String[] args) {
        
 
        Scanner obj1 = new Scanner(System.in);

        System.out.println("1st round oxygen level of trainee 1");
        int input1 =obj1.nextInt();

        Scanner obj2 = new Scanner(System.in);
        System.out.println("1st round oxygen level of trainee 2");
        int input2=obj2.nextInt();

        Scanner obj3 = new Scanner(System.in);
        System.out.println("1st round oxygen level of trainee 3");
        int input3= obj3.nextInt();

         //Scanner obj =new Scanner(System.in);

        System.out.println("for 1st round");
        


      if (input1>=1 && input1<=99);
        System.out.println("1st round oxygen level for trainee 1 is   "+input1);
        if (input2>=1 && input2<=99) 
        System.out.println("1st round oxygen level for trainee 2 is   "+input2);
        if(input3>=1 && input3<=99)
        System.out.println("1st round oxygen level for trainee 3 is   "+input3);

        else
        System.out.println("invalid input");

        System.out.println("2nd round");
        System.out.println("2nd round oxygen level of trainee 1");
        int input4=obj1.nextInt();
        System.out.println("2nd round oxygen level of trainee 2");
        int input5=obj2.nextInt();
        System.out.println("2nd round oxygen level of trainee 3");
        int input6=obj3.nextInt();

       


        System.out.println("2nd round oxygen level for trainee 1 is   "+input4);
        System.out.println("2nd round oxygen level for trainee 2 is   "+input5);
        System.out.println("2nd round oxygen level for trainee 3 is   "+input6);

        System.out.println("3rd round");


        System.out.println("3rd round oxygen level of trainee 1");
        int input7=obj1.nextInt();
        System.out.println("3rd round oxygen level of trainee 2");
        int input8=obj2.nextInt();
        System.out.println("3rd round oxygen level of trainee 3");
        int input9=obj3.nextInt();

        System.out.println("3rd round oxygen level for trainee 1 is   "+input7);
        System.out.println("3rd round oxygen level for trainee 2 is   "+input8);
        System.out.println("3rd round oxygen level for trainee 3 is   "+input9);

      
        int average1=(input1+input4+input7)/3;
      System.out.println("the average oxy levels of trainee 1 is  "+average1);

      int average2=(input2+input5+input8)/3;
      System.out.println("the average oxy levels of trainee 1 is  "+average2);

      int average3=(input3+input6+input9)/3;
      System.out.println("the average oxy levels of trainee 1 is  "+average3);

     
      if(average1<70 ) 

     System.out.println(" trainee 1 is unfit");

     else
     System.out.println("trainee 1 is selected");

     if(average2<70 ) 

     System.out.println(" trainee 2 is unfit");

     else
     System.out.println("trainee 2 is selected");

     if(average3<70 ) 

     System.out.println(" trainee 3 is unfit");

     else
     System.out.println("trainee 3 is selected");


        obj1.close();
        obj2.close();
        obj3.close();

    }


    
}
