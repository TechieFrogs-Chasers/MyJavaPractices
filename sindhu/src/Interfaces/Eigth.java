package sindhu.src.Interfaces;

public interface Eigth {

  default  void hi(){
      System.out.println("default method");
  }

  

     
             
   Apple display() {
        System.out.println("Vehicle interface abstract method implementation");

        class Happy implements Apple   {
            int num = 20;

            void innerDisplay(){
                System.out.println("inside innerClass method"+num);
            }
           
           public void print() {
             System.out.println("Print method");
             
           }

        @Override
        public void hi1() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void hello1() {
            // TODO Auto-generated method stub
            
        }
        }
        innerExer8 inObj = new innerExer8();
        inObj.innerDisplay();
       Vehicles veh = new innerExer8();
       return veh;
 }
public static void main(String[] args) {

 Exercise8 obj = new Exercise8();
//  innerExer8 inObj = obj.new innerExer8();   this class is not visible outside the display method
  System.out.println(obj.display());
 System.out.println("Num of wheels "+ obj.no_of_wheels());  
}

 
}

        

      
       



    
class Test{


    public static void main(String[] args) {
        Test x = new Happy();
    }
}

}