public class String {
    public static void main(String[] args) {
        char[] ch = {'M','O','U'};
        String st = new String(ch);
        //Stirng is a class so we can create a obj, there are 2 ways
        //1 Literial
        String str = "Mounika";//memory cretaed in heap and string constant pool, 
        String str1 = "Mounika";
        //this time check if i have any memory created for same mounika(value), it returns that reference to str1
        //str,str1 always point to the string constant pool area when we call
        // with literal it both str str1 shares the same string constance pool meory allocation
        //2. with new key word 
        String str2 = new String();
        //creats to objs in heap and sting constant str2 always refers to heap area 
        System.out.println(str);// prints null because not intialized
        str.concat("Nadella");
        // new obj is created with mounika nadella, but str doesn't point to new one here, because we are not assign it
        System.out.println(str);//prints Mounika only
        str = str.concat(" Nadella");// assigned the new string to str here
        System.out.println(st);

        //String compare with string using below 
        //equals() method - auhtentication
        //== oprator// sorting
        //compare() method// reference matching

        //equals()method - only values, boolean method
        String s = "Madhu";
        String str3 = new String("Hi");
            System.out.println(s.equals(str3));// false
            String s1 = "Madhu";
            String str4 = new String("Madhu");
                System.out.println(s1.equals(str4));//True
                String s2 = "Madhu";
                String str5 = new String("madhu");
                    System.out.println(s2.equals(str5));// fale, because jave is case sensitive
                    System.out.println(s2.equalsIgnoreCase(str5));//true , both the strings convert into lower case so matched

                    // == operator - checks both have same values and location too- boolean
                    System.out.println(s1==str4);
                    // both have same values, but s1 points to string constant pool obj, str4 points to heap obj
                    // false, becuase it checks the value and the reference too
                    System.out.println(s1==s2);
                    // true, s1 and s2 both are literals they didnot creat new obj, in s2 no new obj is created, it shares the refence of s1
                    String str6 = new String("madhu");
                        System.out.println(str5 == str6);// false
                        // both are not sharing the same memory loaction, but in literal it is diff, both share the same loaction
                        System.out.println(str6.toUpperCase());
                        System.out.println(s1.toLowerCase());
                        //System.out.println(str6.charAt(6));// exception on because only 4 indexs and 5 characters
                        System.out.println(str6.charAt(0));
                        System.out.println(str6.charAt(2));//d
                        String s3 = " Namaste";
                            System.out.println(s3.trim());// eleminated the whitwe spaces before and after the string
                            String s4 = "Hello ALL";
                                System.out.println(s4.trim());// not removed white spcae in between
                                String s5 = "Hello ";
                                    System.out.println(s5.trim());// remove the white space after the string
                                    System.out.println(s5.startsWith("he"));// false
                                    System.out.println(s5.startsWith("HE"));//false
                                    System.out.println(s5.startsWith("He"));//true
                                    System.out.println(s5.endsWith("o")); // false
                                    System.out.println(s5.endsWith(" "));// true
                                    System.out.println(s5.length());//prints the length of string//6
                                        String str7 = new String("Sri");
                                        String s6 = str7.intern();// Hello ALL // it given the value of the s4
                                            System.out.println(s6);
                                            int i = 14;
                                            String str8 = String.valueOf(i);// i value is assigned to str8
                                                System.out.println(str8+i);//1414 it concatenates the both values
                                                String s7 = "Welcome Java Team. Welcome everyone. Welcome to class";
                                                System.out.println(s7);
                                                System.out.println(s7.replace("Welcome", "Hi"));
                                                System.out.println(s7.contains("welcome everyone. Welcome"));
                                                System.out.println(s7.contains("Heloo"));
                                                System.out.println(String.format("name is %s", str7));



    }
    
}
    

