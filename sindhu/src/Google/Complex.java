package sindhu.src.Google;

public class Complex {
    int r;
    int i;
    void sum(int r , int i){
        int x = r+i;
        System.out.println("addition" + x);
       

    }

    void diff(int r , int i){
        
        int y = r-i;
        System.out.println("subtraction" + y);

    }

    void prod(int r , int i){
        
        int z = r *i;
        System.out.println("multiplication" + z);
    }

    public static void main(String[] args) {
        Complex a = new Complex();
        a.sum(4,5);
        a.diff(4,5);
        a.prod(4,5);
        

        
    }

    Complex(){
        System.out.println("default constructor");

    }

        

    
    
}

