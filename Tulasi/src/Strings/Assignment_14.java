package Strings;

public class Assignment_14 {
    public static void main(String[] args) {


        StringBuffer sentence = new StringBuffer();
        sentence.append("Java is very secured ");
        sentence.append("and popular language");
        System.out.println("String is :"+sentence);

        sentence=new StringBuffer();//new obj to clear the above sentence
        System.out.println("String sentence :"+ sentence);

    }
}