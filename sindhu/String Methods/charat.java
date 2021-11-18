public class charat {
    public static void main(String[] args) {
        String s = "sindhus";


        int count =0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='s')
            count++;
        }

        System.out.println(count);

        //characters at odd positions

        for(int i=0; i<s.length();i++){

            if(i%2!=0){

                System.out.println(s.charAt(i));
            }
        }

        //characters at even positions

        for(int i=0; i<s.length();i++){

            if(i%2==0){

                System.out.println(s.charAt(i));
            }

        }

        
        
        
        
        char ch = s.charAt(3);

        System.out.println(ch);

       /* //string index out of bound exception


        char ch1 = s.charAt(9);
        System.out.println(ch1);*/

        //accessing last character

       //int x = s.length();

        char ch2 = s.charAt((s.length())-1);
        System.out.println(ch2);


        



    }
    
}
