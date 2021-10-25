class Apple {
    int number_of_items = 5;
}

class Banana3 extends Apple {
    int number_of_items = 10;

    public Banana3() {
        System.out.println("This is constructor.");
    }

    public void show() {
        System.out.println("no.of banana's" + number_of_items);
        System.out.println("No of apple's" + super.number_of_items);
    }
}

public class Banana {
    public static void main(String[] args) {
        Banana3 obj = new Banana3();
        obj.show();
    }
}
