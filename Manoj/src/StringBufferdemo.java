public class StringBufferdemo {
       public static void main (String...args){
           StringBuffer sb=new StringBuffer("manoj");
        
           System.out.println(sb);

           System.out.println(sb.append(" bellapukonda"));//here we use append method with this we can add string or numbers

           System.out.println(sb.delete(1,3));//here we deleting the group of characters 
           System.out.println(sb.deleteCharAt(4));//here we are able to delete a particular character at mention index

           System.out.println(sb.substring(5));//if we want to print particular character
           System.out.println(sb.substring(2,5));//if we want to print group of characters

           System.out.println(sb.insert(5,"java"));//if we want to add a string at particular index  position we insert

           System.out.println(sb.replace(0,4,"mabeko"));//if we want to replace characters at particular index position we use replace

           System.out.println(sb.reverse());//if we want to reverse the given string we use reverse
           
           //we can alse use these methods in string builder

       }    
}
