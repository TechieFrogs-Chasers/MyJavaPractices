package sindhu.src.ArraysAssignment;

public class fourtytwo {

    public static void main(String[] args) {
        
        
               /* char[] ch = {'a', 'e', 'i', 'o', 'u'};
        
                String st = String.valueOf(ch);
                String st2 = new String(ch);
        
                System.out.println(st);
                System.out.println(st2);
            }
        
    }*/
    
//string to character

String str = "Hello";
      for(int i=0; i<str.length();i++){
        char ch = str.charAt(i);
        System.out.println("Character at "+i+" Position: "+ch);
      } 
   }
}


