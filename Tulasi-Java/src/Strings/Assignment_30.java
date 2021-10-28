package Strings;

public class Assignment_30 {
    public static void main(String[] args) {
        String sentence=new String("Java is very secured programmimg language !");
        sentence=sentence.replaceAll("\\s+", "");
        System.out.println("Sentence after removing all white spaces : "+ sentence);
    }
}
