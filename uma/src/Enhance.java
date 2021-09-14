
public class Enhance {
    
public static void main(String[] args) {
  /*  //if condition in switch
    String status="minor";
    int age= 17;
    switch(status){
        case "minor":
        {
            if(age==17)
                System.out.println("minor");
            else
            System.out.println("major");
            }
            break;
            case "eligible":{
                age=18;
                String output=(age>=18)? "minor":"major";
                System.out.println(output);}
                break;
                default:
                System.out.println("kid");
            }
       // multiple case numbers in a single line with char
      char ch='b';
        switch(ch){
            case 'a','e','i','o','u':
            System.out.println("vowel");
            break;
            default:
            System.out.println("consonant");
        }
       //multiple case numbers given in a single line with int
       int a=1;
       switch(a){
           case 1,2,3:
           System.out.println("pets");
           break;
           case 4,5,6:
           System.out.println("wild");
          break;
          default:
          System.out.println("not animals"); 
       }*/

        //using yield
        char ch1='k';
       String s=switch (ch1) {
           case 'a','e','i','o','u':
           System.out.println(ch1+"  is an vowel");
           
              yield "vowel";
            
               default:
               yield "consonant";};
               System.out.println(s);
       
       // using arrows

          char ch2='Y';{
           switch(ch2){
               case'a'|'e'|'i'|'o'|'u'->
               System.out.println("is a lower case vowel");
               case 'A'|'E'|'I'|'O'|'U'->
               System.out.println("is a upper case vowel");
               default->
               System.out.println(ch2+"   is consonant");}

      //scope of the block

               int i=20;
               int j=10;
               switch (i+j){
                   case 1:
                   {
           System.out.println("10");
           int k=5;
          int z=(i+j+k);
         System.out.println(z);}
           break;
           case 30:
           System.out.println("30");
           break;
           default:
           System.out.println("do not add");}

           //yield
         int  code=10;
         String k =switch(code){
              case 1,2:
              yield "laptop" ;
              case 3,4:
              yield "desktop";
            default:
            yield "unknown";
        
         };
          System.out.println(k);
        }   
    }
  }
