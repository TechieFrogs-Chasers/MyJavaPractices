package Interfaces;

    public class Parent {
    interface A{
        void msg();
    }
            public class Child implements A{
            public void msg(){
                System.out.println("enter parent class");
            }
        }
        
            private class Child1 implements A{
                public void msg(){
                    System.out.println("enter another class");
                }
            }
        
            interface B{
                void msg();
            }
            public class Daughter implements B{
                public void msg()
                {
                    System.out.println("enter daughter class");
                }
            }
          
            public static void main(String[] args) {
                Parent par = new Parent();
                Child dau = par.new Child();
                dau.msg();
                //par.msg();
            }
        }
    
        
    
              
            
            
        
        

        
    


    

