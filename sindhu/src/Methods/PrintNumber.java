package sindhu.src.Methods;

public class PrintNumber {
    void Printn (int i){
        System.out.println("method1");
    }

    void Printn (short i){
        System.out.println("method2");
    }

    void Printn (float i){
        System.out.println("method3");
    }

    void Printn (byte i){
        System.out.println("method3");
    }

    double Printn(double i){
        System.out.println("method4");
        return i;
    }

    public static void main(String[] args) {
        PrintNumber x = new PrintNumber();
       x.Printn((byte)2);
       x.Printn((short)(2));
       x.Printn(2.0d);
    }
}
