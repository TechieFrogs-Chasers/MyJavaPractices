public class Series {

    


    public static void main(String[] args) {
        int X = 16;
        findTerm(X);
         
       
    }

    static  void findTerm(int n){
     
        if(n%2==0){

            n = n / 2;
            n = 2 * (n - 1);
            System.out.println(n / 2);
            
        }
        else{
    
        n = (n / 2) + 1;
        n = 2 * (n - 1);
        System.out.println(n);
        }

    }
    
}
