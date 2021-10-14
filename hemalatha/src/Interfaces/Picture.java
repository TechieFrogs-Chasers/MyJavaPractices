package Interfaces;

public interface Picture {
    int i = 6;
  interface photoshoot {
    public void shoot();
    public void camera();
  }
     
public class Selfie implements Picture {
    static String name = "hema";
    
    public void camera()
    {
        System.out.println("to take the pictures");
    }
    static public void shoot()
    { 
      System.out.println("pre-wedding shoot");  
    }
    public int noOfPhotos()
    {
       return 3; 
    }
    public static void main(String[] args) {
        Selfie obj = new Selfie();
        shoot();
        obj.camera();
        obj.noOfPhotos();
        System.out.println(Selfie.i);
        System.out.println(Selfie.name);
        System.out.println();
        
        
    }

}
}