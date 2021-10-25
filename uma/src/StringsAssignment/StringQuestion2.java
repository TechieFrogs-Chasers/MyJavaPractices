public class StringQuestion2 {
    public static void main(String[] args) {
        

        String[] lex = new String[]{"zebra","violin","bucket","jam"};

        System.out.println(lex.length);

        for(int i=0; i<=3;  i++){

            for(int j =1; j<4; j++){

                if(lex[i].compareTo(lex[j])>0){
                    String temp = lex[i];
                    lex[i]= lex[j];
                    lex[j]=temp;
                }
            }

        }

        for(int i=0; i<lex.length; i++)
        System.out.println("lexographical order is "+lex[i]);
        
           
           
            
        
        
       
        


    }
}
