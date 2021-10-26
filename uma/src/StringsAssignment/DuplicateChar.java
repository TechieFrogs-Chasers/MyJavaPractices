public class DuplicateChar {
    public static void main(String[] args) {
        
        String str = "maple millet";

        char[] ch = str.toCharArray();

        int count=0;
        System.out.println(ch);
        for (int i=0; i< str.length(); i++){
           
            for(int j=i+1; j<str.length(); j++){
                
                if (ch[i]==ch[j]){
                    count++;
                   ch[j]=0;
                } 
            }
                if (count>0 && ch[i] !=0){
                    System.out.println(ch[i]);
                
                
            }

        }
    }
    
}
