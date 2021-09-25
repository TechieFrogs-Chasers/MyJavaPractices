package Methods;


public class PrintIntAndChar {
    void printIntAndChar(int num,char n){
        System.out.println("Enter the value- " + num +","+ "Enter the char- "+ n+"." );
    }
    void printIntAndChar(char n,int num){
        System.out.println("Enter the char- "+ n +","+"Enter the value- "+num+"." );
    }
    public static void main(String[] args) {
        PrintIntAndChar myMethodObj=new PrintIntAndChar();
        myMethodObj.printIntAndChar(55,'P');
        myMethodObj.printIntAndChar('K',66);

    }
}
