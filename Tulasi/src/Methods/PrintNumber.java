package Methods;//Package

public class PrintNumber {//Driver class
    void printn(byte num,String name,char surName){//method with three parameters-first method
        System.out.println("name of the person is " + name +" , "+" age is "+ num+" , "+"Surname is "+ surName+" . ");
    }
    void printn(short houseNum){//method with short parameter-second method

        System.out.println("House number: "+houseNum );
    }
    void printn(int salary){//method with int parameter-third method

        System.out.println("Income : "+salary);
    }
     float printn(float tax){//method with float parameter and float return value-fourth method
        System.out.println("Tax:"+ tax);
         return tax;
     }
    public static void main(String[] args) {//main method
        PrintNumber myMethodObj=new PrintNumber();//Instance for driver class
        myMethodObj.printn((byte) 25,"Sam",'K');//call first method
        myMethodObj.printn((short)5326);//call second method
        myMethodObj.printn(100000);//call third method
        myMethodObj.printn(5.5f);//call fourth method

    }

}
