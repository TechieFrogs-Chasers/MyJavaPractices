public class Question39 {
    public static void main(String[] args) {
        
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
