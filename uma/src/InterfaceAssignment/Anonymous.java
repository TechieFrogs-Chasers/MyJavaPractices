public interface Anonymous{

    void display();

     //final void dis(){} // final can not be given to interface methods

    

}
class Any implements Anonymous{

   public void display(){

    }

    public static void main(String[] args) {

        Any.accept(new Anonymous(){
            public void display(){
                System.out.println("anonymous");
            }
            
        });
        
       Any objAny = new Any();
       objAny.display(); 
    }

    
    
    public static void accept(Anonymous obj){

    }
}
