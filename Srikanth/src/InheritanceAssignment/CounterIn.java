package InheritanceAssignment;

public class CounterIn {
    int i;

    public void increment(int i) {
        System.out.println("i:" + i);
    }
}

class countersubclass extends CounterIn {
    public static void main(String[] args) {
        CounterIn objCounterIn = new CounterIn();
        objCounterIn.increment(3);
    }

}
