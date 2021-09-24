import java.io.*;

public class addbuffer {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter integer: ");
        int x = Integer.parseInt(in.readLine());
        System.out.println("Enter second integer: ");
        int y = Integer.parseInt(in.readLine());

        int z = x + y;
        System.out.println("addition of two no: " + z);

    }
}
