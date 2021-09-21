interface Shapes{
    void draw();
    double getArea();
    public boolean fitsText(String message);

}

class Circles implements Shapes{
    double radius;
    String color;

    Circles(double radius ){
        this.radius = radius;
    }
	
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}

	public String getColor(){
        color = "Blue";
		return this.color;
	}
    public boolean fitsText(String message) {
        return message.length() < (2 * this.radius);
      }

}

class Rectangles implements Shapes{
    double length,width;
    String color;
        Rectangles(double length,double width){
            this.length = length;
            this.width = width;
        }
       
        public void draw() {
            System.out.println("Drawing Rectangle");
            
        }
     
        public double getArea() {
            return this.length*this.width;
        }

        public String getColor(){
            color = "yellow";
            return this.color;
        } 

        public boolean fitsText(String message) {
            return message.length() < this.width;
          }

}

class Sign {
    Shapes shape;
    String text;
    
    public String toString() {
        return "Sign [text=" + text + "]";
    }

    Sign(Shapes shape,String text){
        this.shape = shape;
        this.text = text;
    }
  
  }
public class Exercise9 {
    public static void main(String[] args) {
        
    }
    
}
