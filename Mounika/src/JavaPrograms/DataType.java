package JavaPrograms;
public class DataType {

    byte b = 126;
     short s =31256;
     int i = 458621;
     long l = 56841356L;
     float f = 58.0f;
     double d = 5869.21;
     boolean x;
     char ch = 'N';//singal char shoul be given, 
     //memory allocation is done based on ASCI code
     String s1 = "Mounika"; // primitive data type


 public static void main(String[] args) 
 {
     int i = 58;

   DataType DataTypeObj = new DataType();
   System.out.println(DataTypeObj.b);  
   System.out.println(DataTypeObj.s);
   System.out.println(DataTypeObj.i);
   System.out.println(DataTypeObj.l);
   System.out.println(DataTypeObj.f+"   "+DataTypeObj.l);
   System.out.println(DataTypeObj.i+DataTypeObj.d);
   System.out.println(DataTypeObj.x);
   System.out.println(DataTypeObj.s1);
   System.out.println(DataTypeObj.ch);
   System.out.println(i);

}
    
}
