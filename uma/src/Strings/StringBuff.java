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
        
    }
    
}


