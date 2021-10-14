package Interfaces;

public interface First {
    int k=4;
    float m=60;
    interface Fruits{
    public void apple();
    public void mango();
    }
    public class Health implements First{
        public void apple()
        {
            System.out.println("red colour");
        }
        public void mango()
        {
            System.out.println("yellow colour");
        }
    }
    
   /* public interface Second {
        interface vegetables{
            public void carrot();
            public void beans();
        }
        public class Cooking implements Second,First{
            public void carrot(){
                System.out.println("orange colour");
            }
            public void beans(){
                System.out.println("green colour");
            }
        }*/
        
    public static void main(String[] args) {
        //Cooking object = new Cooking();
        Health obj = new Health();
        //object.beans();
        //object.carrot();
        obj.apple();
        obj.mango();
        System.out.println(First.k);
        System.out.println(First.m);
        


    }

    
}
