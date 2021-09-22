interface Vehicles{
    int no_of_wheels();
    void display();
}

public class Exercise8 implements Vehicles {
    public int no_of_wheels() {
        return 4;
    }
    public void display() {
           System.out.println("Vehicle interface abstract method implementation");
           class innerExer8 {
               int num = 20;
               void innerDisplay(){
                   System.out.println("inside innerClass method"+num);
               }
           }

           innerExer8 inObj = new innerExer8();
           inObj.innerDisplay();
    }
  public static void main(String[] args) {

    Exercise8 obj = new Exercise8();
  //  innerExer8 inObj = obj.new innerExer8();   this class is not visible outside the display method
    obj.display();
    System.out.println("Num of wheels "+ obj.no_of_wheels());  
  }

    
}
