public class Methods {
    public static void main(String...args){
    int i;
    String name;
        Methods obj=new Methods();
        obj.displayText(20,"manoj");
        obj.displayText(5);
        


    }
    
    static int displayText(int k,String n ){ //in this we use  datatypes those are all of return types
         int  i=k;
         String name=n;
        
           System.out.println(i+" "+name);
        return i ; //here we use return to close the method for 
    }
     void displayText(int j){ //for void don't have any return value 
       System.out.println(j);
     }
}
