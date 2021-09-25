package OopsConcepts;

public class Complex {
    
  
   int real, fiction;

   Complex(){

   }

    Complex( int r, int f){
  
     this.real=r;
    this.fiction=f;

    }
   
    public static void main(String[] args) {
    Complex n1 = new Complex(4,8);
    Complex n2 = new Complex(5,7);
    Complex n3= new Complex();
    Complex n4= new Complex();
     n3 = n3.add(n1, n2);
     System.out.println("Sum =  " +n3.real+"  i "+n3.fiction);
     n4 =n4.difference(n1,n2);
      System.out.println("difference is "+n4.real+  n4.fiction);
    }

     Complex add( Complex n1,Complex n2){

        Complex temp = new Complex();

        temp.real = n1.real + n2.real;
        temp.fiction = n1.fiction + n2.fiction;

        return(temp);  
    }
   
     Complex difference( Complex n1,Complex n2){

        Complex temp1 = new Complex();

        temp1.real = n1.real - n2.real;
        temp1.fiction = n1.fiction - n2.fiction;

        return(temp1);  
    }
}
  
    
  