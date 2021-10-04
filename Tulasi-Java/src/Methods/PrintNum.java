package Methods;


class PrintNumI {
    int i;

    public void printNum() {
        System.out.println("Value of i :" + i);
    }
}

class PrintNumJ extends PrintNumI {
    int j;

    public void printNUM() {
        System.out.println("Value if j :" + j);
    }
}

public class PrintNum {
    public static void main(String[] args) {
        PrintNumJ obj = new PrintNumJ();
        obj.i = 20;
        obj.j = 30;
        obj.printNUM();

    }
}