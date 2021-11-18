package Strings_Step_2;
//How to convert String Buffer/String Builder to String?
public class StringBufferToString_50 {
    public static void main(String[] args) {
        String stringName[]={"How", "to", "convert", "String Buffer/String Builder", "to", "String?"};
        StringBuffer strbufferObj=new StringBuffer();
        strbufferObj.append(stringName[0]);
        strbufferObj.append(" " +stringName[1]);
        strbufferObj.append(" " +stringName[2]);
        strbufferObj.append(" " +stringName[3]);
        strbufferObj.append(" " +stringName[4]);
        strbufferObj.append(" " +stringName[5]);
        String stringobj=strbufferObj.toString();
        System.out.println(stringobj);

    }
}
