package Methods;//Package


class PrintNumI {//superclass
    int i;

    public void printNum() {
        System.out.println("Value of i :" + i);
    }
}

class PrintNumJ extends PrintNumI {//subclass
    int j;

    public void printNum() {
        System.out.println("Value if j :" + j);
    }
}

public class PrintNum {//Driverclass
    public static void main(String[] args) {//main method
        PrintNumJ obj = new PrintNumJ();//Instance for subclass
        obj.i = 20;//call variable
        obj.j = 30;//call variable
        obj.printNum();//call method

    }
}