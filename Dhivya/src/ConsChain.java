public class ConsChain {
    public static void main(String[] args) {
        
       // Chain cons1 = new Chain("krish", 34);  
        Chain cons = new Chain("ram", 67.9f);
    }
}
class Chain
{
    static int a;
    static String employeename;
    float m;
    
    Chain(){
        this("kavya", 28);
        
       // this(80,5.6f);
        System.out.println("default");
    }
Chain(String r,int no, float fvalue){
   
    a = no;
    m= fvalue;
    System.out.println("Age and Loan amount: " + a+ " " + m);
}
 Chain (String r, int no){
    this(r);
     a= no;
     employeename=r;
     System.out.println("The name:" + employeename +" and the age is " + a);
     }
     Chain(String r, float m){
         this("kavya", 28);
        System.out.println("The name is :" + r +" the loan amount is " + m);
     }
     Chain(String r){
        this("kavya",38,5.6f);
         System.out.println("The name is: "+ r);

     }
 }
