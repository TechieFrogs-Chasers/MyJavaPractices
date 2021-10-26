public class Question17 {
   
    public static void main(String[] args) {
        String str = "welcome";
       /* int count =0;
        for(int i=0;i<=str.length()-1;i++){
            
        count++;s
        System.out.println("Char at "+i+" place "+str.charAt(i));
        }
        System.out.println(count);*/



        

    System.out.println("Characters in " + str + " are:");

    
    for(int i = 0; i<str.length(); i++) {

      // access each character
      char a = str.charAt(i);
      //System.out.print(a + ", "); // prints horizontally with " ,"
      System.out.println(a); //prints vertically
    }
        
    }
}
