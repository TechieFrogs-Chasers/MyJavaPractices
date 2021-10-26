package practice;

public class stringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        // StringBuffer is a pre-defined class, new-is a operator
        // buffer is an identifier
        System.out.println("Initial capacity:" + buffer.capacity());
        buffer.append("Hello");
        buffer.append("Java");
        buffer.append("Developers");
        System.out.println("Contents of Stringbuffer: " + buffer);
        System.out.println("Capacity after adding:" + buffer.capacity());
    }
}
