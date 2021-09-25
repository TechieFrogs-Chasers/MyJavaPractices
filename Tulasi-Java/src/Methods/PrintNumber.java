package Methods;

public class PrintNumber {
    void printn(byte num,String name,char surName){
        System.out.println("name of the person is " + name +" , "+" age is "+ num+" , "+"Surname is "+ surName+" . ");
    }
    void printn(short houseNum){
        System.out.println("House number: "+houseNum );
    }
    void printn(int salary){
        System.out.println("Income : "+salary);
    }
     float printn(float tax){
        System.out.println("Tax:"+ tax);
         return tax;
     }
    public static void main(String[] args) {
        PrintNumber myMethodObj=new PrintNumber();
        myMethodObj.printn((byte) 25,"Sam",'K');
        myMethodObj.printn((short)5326);
        myMethodObj.printn(100000);
        myMethodObj.printn(5.5f);

    }

}
