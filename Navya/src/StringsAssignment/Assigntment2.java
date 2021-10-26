package StringsAssignment;

public class Assigntment2 {
    public static void main(String[] args) {
        String str = "Hii hello i am navya";
        String[] str1  = str.split(" ");
        for(int i = 0;i<str1.length;i++){
            for(int j = i+1;j<str1.length;j++){
                if (str1[i].compareToIgnoreCase(str1[j]) > 0) {
                     String temp = str1[i];
                     str1[i]= str1[j];
                     str1[j] = temp;
                      }
             }  
         }
         System.out.println("lexicographic order : ");
          for(int i = 0; i<str1.length;i++){
           System.out.print(str1[i]+" ");
          }
    }
}