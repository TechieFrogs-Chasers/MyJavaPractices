package Practices;

public class BufferDemo {


    public static void main(String[] args) {
        StringBuffer inforamtion = new StringBuffer();
        System.out.println(inforamtion);

        inforamtion.insert(0, "Java");
        System.out.println(inforamtion);

        StringBuffer info = new StringBuffer("Welcome to    java programming language.");
        System.out.println(info.length());
        info.replace(11, 13, "all");
        System.out.println(info);

        info.delete(38,40);
        info.reverse();
        System.out.println(info);
        StringBuilder names=new StringBuilder("Java coding");
        System.out.println(names.append(info));//using append added both string buffer and string bulider-append(stringbuffer sb) used
        System.out.println(names.capacity());
        System.out.println(info.capacity());
        info.ensureCapacity(86);
        System.out.println(info.capacity());//56*2=114+2=116
       // names.getChars(1,8,[1],6);

    }

}
