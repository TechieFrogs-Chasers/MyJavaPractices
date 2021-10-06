package sindhu.src.OOPs;

public class MethodOverloading {
    int hi(int i , int j){
        return i;
        //System.out.println("method overloading1");
    }
    
    long hi(int i , int j, int k){
        return j;
        //System.out.println("method overloading");
    }

    public static void main(String[] args) {
        MethodOverloading x = new MethodOverloading();
       System.out.println(x.hi(1,2,3));


    }
}
