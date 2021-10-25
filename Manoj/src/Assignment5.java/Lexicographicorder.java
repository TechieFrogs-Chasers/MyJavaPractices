package Assignment5.java;

public class Lexicographicorder {
    public static void main(String...args){
    String [] str={"manoj","java","pratices","assignments"};
    for (int i=0; i<3;i++) {
        for (int j=i+1;j<4;j++){
            if (str[i].compareTo(str[j])>0){
                String temp=str[i];
                str[i]=str[j];
                str[j]=temp;

            }

        }
    }
    for (int i=0;i<str.length;i++){
        System.out.println(str[i]);
    }
}
}
