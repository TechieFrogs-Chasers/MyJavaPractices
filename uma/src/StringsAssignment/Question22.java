public class Question22 {

    public static void main(String[] args) {
        String str = "umadevi boppana";
       
        int total = str.length();
        str= str.replace(" ", "");
        System.out.println(str);
        System.out.println(total +" length of the string with spaces");
        
        int totalWithOutSpaces=0;
        for (int i =0;i<=str.length()-1;i++){

        totalWithOutSpaces++;
        }
        System.out.println(totalWithOutSpaces+" is the total number of characters with out spaces");
        
    }
}
