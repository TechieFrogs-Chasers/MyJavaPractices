package Assignment_1;

    
 public class Chain2 {
    int rollno,a;
    String name,address;
    Chain2(String name,int rollno){ //constructor
        this.name=name;
        this.rollno=rollno;
        System.out.println("two parameter");
    }
    Chain2(){
        this(6);
        System.out.println("zero parameter");
    }
    Chain2(int age){
        this.a=age;
        System.out.println("one parameter");
    }
    Chain2(int age,String address,int rollno){
        this.a=age;
        this.address=address;
        this.rollno=rollno;
        System.out.println("three parameter");
    }

    public static void main(String[] args) {
        Chain2 ch1 = new Chain2("happy",101);
        System.out.println(ch1.name+" "+ch1.rollno);
        Chain2 ch2 = new Chain2("sad",102); 
        System.out.println(ch2.name+" "+ch2.rollno);
        Chain2 ch3 = new Chain2(22);
        System.out.println(ch3.a);
        Chain2 ch4 =  new Chain2(22,"USA",12);
        System.out.println(ch4.a+" "+ch4.address+" "+ch4.rollno);


    }
    
}
