public class PrintNumber{

    void printn(int i,byte b,short s){
     System.out.println(i+"  "+b+"  "+s);
    }

    void printn(String name,boolean t,char ch){
        System.out.println(name+"  "+t+"  "+ch);
    }

    void printn(double d,float f,long l){
        System.out.println(d+"  "+f+" "+l);
    }
    public static void main(String[] args) {
        PrintNumber obj =new PrintNumber();
        obj.printn(50,126,12);
        obj.printn("uma", true, 'B');
        obj.printn(10.0, 20.0f, 10000000l);
    }
    
}
//---------------------------------------------------------------------------------

class PrintNum{

void print (int num,String name){
    System.out.println(num+"  "+name);
}

void print(String name,int num){
    System.out.println(name+"  "+num);
}

public static void main(String[] args) {
    PrintNum objPrintNum = new PrintNum();
    objPrintNum.print(100, "uma");
    objPrintNum.print("ram",200);
}

}
