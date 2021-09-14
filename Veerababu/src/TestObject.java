public class TestObject {
         int a;
         int b;
     
     void Display(){
        System.out.println(a+b);
        
    }
    TestObject(){
        a=200;
        b=200;
    }
    public static void main(String[] args) {
        TestObject test = new TestObject();
        test.Display();
        System.out.println(test.a+test.a);
    }
    void screen(){
        System.out.println(a);
        
    }
    
}
