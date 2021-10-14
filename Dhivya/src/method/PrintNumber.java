package method;

public class PrintNumber {
    byte b;
    short s;
    int i;
    float f;
    long l;
    double d;
    char c;
    String name;
    boolean boo;
   void printN(byte b){
       this.b=b;
        System.out.println(" The value of Byte: " + b);
    }
    void printN(short s){
        System.out.println(" The value of Short: " + s);
    }
    void printN(int i){
        System.out.println(" The value of int: "+ i);
    }
    void printN(long l){
        System.out.println(" The value of long: "+ l);
    }
    void printN(float f){
        System.out.println(" The value of float: " + f);
    }
    void printN(double d){
        System.out.println(" The value of double: "+d);
    }
    void printN(char c){
        System.out.println(" The value of character: "+ c);
    }
    void printN(boolean boo){
        System.out.println(" The value of Boolean: "+ boo);
    }
    void printN(String name){
        System.out.println(" The value of string: " +name);
    }

public static void main(String[] args) {
    System.out.println(" The outputs for different datatypes using method overloading:");
    PrintNumber obj = new PrintNumber();
    obj.printN((short)212);
    obj.printN((byte)20);
    obj.printN("Dhivya");
    obj.printN(true);
    obj.printN(20000);
    obj.printN('a');
    obj.printN(450008970d);
    obj.printN(5678990f);
}
    
}
