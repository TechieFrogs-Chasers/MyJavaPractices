package sindhu.src.Methods;

public class PrintNumber1 {

    void hi(int i , char ch){
        System.out.println("method1" + " "+ i + " "+ ch);

    }

    void hi(char ch , int i){
        System.out.println("method2" + " "+ i + " "+ ch);
    }

    public static void main(String[] args) {
        PrintNumber1 x = new PrintNumber1();
        x.hi(2, 'h');
    }
    
}
