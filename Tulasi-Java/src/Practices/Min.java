package Practices;

public class Min {

        public static int min(int a, int b, int c) {
            int result= Math.min(a, Math.min(b,c));
            return result;
            //write your code here
        }

        public static void main(String[] args) throws Exception {
            System.out.println(min(1, 2, 3));
            System.out.println(min(-1, -2, -3));
            System.out.println(min(3, 5, 3));
            System.out.println(min(5, 5, 10));
        }

    }


