public class Multiple {

    public static void main(String[] args) {
        

        int a =10;
        int b= 0;
        String[]  s= {"uma"};
        try{
             System.out.println(s[1]);
            System.out.println("A");
            int total= a/b;
            System.out.println(total);
            
        }
        catch(ArrayIndexOutOfBoundsException aob){
            System.out.println(aob);

        }
        catch(Exception ex){
            System.out.println(ex);
         
        }
        System.out.println("exit");
    }
    
}

// output is java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
//exit
