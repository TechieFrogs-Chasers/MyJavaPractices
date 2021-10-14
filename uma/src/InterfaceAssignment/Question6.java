public interface Question6 extends one,two,three {

    void method();
    
}

interface one {
    void one_method1();
    void one_method2();

}
interface two{

    void two_method1();
    void two_method2();

}
interface three{

    void three_method1();
    void three_method2();

}
class Question1 extends Question2 implements Question6{

    @Override
    public void one_method1() {
        
    }

    @Override
    public void one_method2() {
        
    }

    @Override
    public void two_method1() {
        
    }

    @Override
    public void two_method2() {
       
        
    }

    @Override
    public void three_method1() {
        
        
    }

    @Override
    public void three_method2() {
        
        
    }

    @Override
    public void method() {
        
    }
    static void over(interface one){
        
    }

}
class Question2{
    public static void main(String[] args) {
        
    }
}