package Strings_Step_2;
//19.WAP to print longest substring present in a given sentence?
public class SubString_19 {
    public static void main(String[] args) {
        String stringName="Today is the happiest day of my life";
        String[] word=stringName.split(" ");
        String longest=" ";
        for(int i=0;i<word.length;i++){
            if(word[i].length()>=longest.length()){
                longest=word[i];
            }
        }
        System.out.println(longest);
        System.out.println(longest.length());
    }
}
