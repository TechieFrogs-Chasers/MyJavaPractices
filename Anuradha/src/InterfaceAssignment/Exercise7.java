public interface Exercise7{          //Interface Package
    void  num();
}


/*  public class Ex7Class {

    protected class InnerEX7Class implements Exercise7    //EX7Class from ClassObjectAssignment package
    {
        public void num() {
            System.out.println("NUM method in InnerEx7 inner class"); 
        }

        public void innerEx7Method(){
            System.out.println("innerEx7 method");
        }
    }
}
  */


/*
 public class Ex7SubClass  extends Ex7Class {   //Ex7SubClass from Inheritance Assignment package

        public static void main(String[] args) {
            Ex7Class exObj = new Ex7Class();
            InnerEX7Class innObj = exObj.new InnerEX7Class();
            innObj.innerEx7Method();
            innObj.num();
        }
    
}*/ 