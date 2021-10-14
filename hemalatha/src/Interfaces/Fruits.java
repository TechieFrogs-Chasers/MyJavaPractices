package Interfaces;
/* create class and implementing interface */

 interface Fruits {
    int count=5;
    int weight=10;
    public void type1();
    public void type2();
    public void type3();
 }
    
 class WaterMelon implements Fruits{
    public void type1()
    {
        System.out.println("WaterMelon");
        System.out.println("fruit colour is:green");
    }
    public void type2()
    {
        System.out.println("fruit cost is:50");
    }
    public void type3()
    {
        System.out.println("fruit weight is:1kg");
    }
}

    class Apple implements Fruits{
        public void type1()
        {
            System.out.println("Apple");
            System.out.println("fruit colour is:red");
        }
        public void type2()
        {
            System.out.println("fruit cost is:20");
        }
        public void type3()
        {
            System.out.println("fruit weight is:20grams");
        }
    }
    
    class Mango implements Fruits{
        public void type1()
        {
            System.out.println("Mango");
            System.out.println("fruit colour is:yellow");
        }
        public void type2()
        {
            System.out.println("fruit cost is:40");
        }
        public void type3()
        {
            System.out.println("fruit weight is:50grams");
        }
    }
    
    class InterfaceDemo{
        public static void main(String[] args) {
            WaterMelon water = new WaterMelon();
            water.type1();
            water.type2();
            water.type3();
            Apple app = new Apple();
            app.type1();
            app.type2();
            app.type3();
            Mango man = new Mango();
            man.type1();
            man.type2();
            man.type3();
            


        }
    

    }

 


    

 
    

