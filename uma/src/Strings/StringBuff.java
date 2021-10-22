public class StringBuff {

    public static void main(String[] args) {
        StringBuffer buff = new StringBuffer();  //empty constructor prints "stringBuffer@4617c264"
        System.out.println(buff);

        StringBuffer buff1 = new  StringBuffer("welcome");  // prints welcome
        buff1.append("to java"); // adds " to java" .... prints "welcome to java"
        buff1.append(10);  // adds 10 .....prints "welcome to java 10"
        
        buff1.insert(7, " "); //insert gap at 7 th character

        buff1.setLength(20);
       buff1.replace(0, 16, "program");

        System.out.println(buff1);

        

        StringBuffer buff2 = new StringBuffer("hello everyone");


        buff2.append(true);
        buff2.appendCodePoint(10);

        buff2.charAt(5);
        buff2.delete(7,8);//starting from the given number ,deletes the difference(8-7=1) ,,one character

        System.out.println(buff2);


        StringBuffer sb = new StringBuffer("buffer");
        System.out.println(sb.capacity());  // 16+6=22

        System.out.println(sb);  // op -- buffer
       // System.out.println(sb.reverse()); //op -- reffub
        System.out.println(sb.charAt(1));
        System.out.println(sb.length());
        System.out.println(sb.append("ing"));
        System.out.println(sb.toString()); //prints the whole string "buffering"
        System.out.println(sb.codePointAt(1));  // prints ascii code at the point specified //ascii value of "u " is 117
        System.out.println(sb.codePointBefore(1));  //op is 98 // ascii value of  character before 1 is b
        System.out.println(sb.hashCode());  // op is 1175962212

        StringBuffer st = new StringBuffer("umadevi") ;
        System.out.println(st.lastIndexOf(""));  //op is 7, prints length of the last string(umadevi=7)
        System.out.println(sb.chars()); //java.util.stream.IntPipeline$Head@8efb846
        System.out.println(sb.getClass());  //class java.lang.StringBuffer
        System.out.println(sb.subSequence(2, 4));// from "buffering"  prints ff ...from 2 to 4
        System.out.println(sb.capacity());
        
    }
    
}


