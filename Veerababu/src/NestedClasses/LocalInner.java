package NestedClasses;

import NestedClasses.LocalInner.Inner.Veeru;

public class LocalInner {
    
    int a ;
    int b ;
    {
        if(a<=b){
            System.out.println("a is greater");
        }
        else
        {
            System.out.println("Hi");
        }
    }
    void display(int l, int m){
        a = l;
        b = m;
        System.out.println("Sum of a and b  "+ (l+m));
    }
    private int Add(int x , int y)
    {
        if(x<=y)
        {
            System.out.println("In Hello");
        }
        else
        {
            System.out.println("Else  ");
        }
        Inner innerObj = new Inner(6, 6);
        System.out.println("Inside"+" "+innerObj.k);
        int z = x+y;
        return z;
    }
    public static String name(String identity)
    {
        return identity;
    }
            class Inner{
                int i;
                int j ;
                int k;
                
                Inner(int i, int j)
                {
                    this.i=i;
                    this.j =j;
                    k = i+j;
                }
                void display(){
                    System.out.println("In the Inner Method  "+a+" "+b);
                }

                private class MostInner{ 
                    void Hello(){
                        System.out.println("inner class Variables"+" "+i+" "+j+" "+a);
                       
                    }
                    int Sum(){
                        return a;
                    }
                }
                    static class Veeru{
                        void statics(){
                            System.out.println("Static class");
                        }
                    }
            }


    public static void main(String[] args) {
        

        LocalInner localInner = new LocalInner();
        int result = localInner.Add(4, 5);
        System.out.println("Hello a+b "+" "+result);
        localInner.display(20, 40);
        String identifier = LocalInner.name("Java");
        System.out.println("Name  "+identifier);
        LocalInner.Inner inner = localInner.new Inner(5,5);
        System.out.println("Constructor  "+inner.k);
        inner.display();
        LocalInner.Inner.MostInner mostInner = inner.new MostInner();
        int result1 = mostInner.Sum();
        System.out.println("Sum of Most Inner Class"+" "+result1);
        mostInner.Hello();
        Veeru veeruObj = new Veeru();
        veeruObj.statics();
            
    }
}
