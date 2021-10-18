public class StringDemo2 {
    public static void main(String...args){
        String s1="mahendra";
        String s2="toyato";
        //here it checks the strings in lexicographic order 
        //asci code of m=109 and t=116
        System.out.println(s1.compareTo(s2)); // it gives the negative value because  m < t =109-116=-7
        System.out.println(s2.compareTo(s1)); //it gives positive value because m > t = 116-109=7

        String s3="manoj";
        String s4="maneesh";
        //here first three alphabets are same and it next letters 
        //o=111 and e=101 
        System.out.println(s3.compareTo(s4));//here it positive value because o>e= 111-101=10

        String s5="cat";
        String s6="catmeow";
        //here first three letter are same and 2nd word have extra four letters 
        System.out.println(s5.compareTo(s6)); 

        String s7="Dog";
        String s8="cat";
        String s9="1at";
        //here in asci code captial  letters have lesser values than lower case letters
        System.out.println(s7.compareTo(s8)); //here it gives we get negative value.
        System.out.println(s8.compareTo(s9)); //number values are lesser than lower case letters so that it gives you positive value
        


    

    } 
    
}
