public class  StringMethodsExamples1{
    public static void main(String[] args) {
        
        //chatAt()  .. displays characters at odd number places in the given string
        String str = "Welcome to Java";          
        for (int i=0; i<=str.length()-1; i++) {  
           if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str.charAt(i));  
            }
            /*if(i%2==0){
                System.out.println("Char at "+i+" place "+str.charAt(i)); // prints characters in even number places
            }
            else
            System.out.println("Char at "+i+"place  "+str.charAt(i));  // prints all  places*/
        } 
        
     //finding the frequency of a character in a given string

        String str1 = "Welcome to Java programming";  
        int count = 0;  
        for (int i=0; i<=str1.length()-1; i++) {  
            if(str1.charAt(i) == 'a') {  
                count++;  
            }
        } 
        System.out.println("frequency of a is  "+count);
        
































    }
    
}