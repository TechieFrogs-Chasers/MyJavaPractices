package practice;

public class StringBuffer1 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hello team,");
        // str.length();
        /*
         * System.out.println(str.append("techifrogs.")); // Original String is changed.
         * System.out.println(str.insert(0, "hi")); System.out.println(str.replace(0, 5,
         * "Happy")); System.out.println(str.delete(0, 5)); //
         * System.out.println(str.reverse());
         */
        System.out.println("before ensurecapacity" + str.capacity());
        str.ensureCapacity(30);
        System.out.println("After ensure capacity:" + str.capacity());// old capacity *2)+2

        System.out.println(str.substring(1));

    }

}
