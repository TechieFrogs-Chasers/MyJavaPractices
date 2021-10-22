public class StringDoubts {

    public static void main(String[] args) {
        
    
    String a = "love";
    String b ="you";
    String c = "uma";
    String c1= "varsha";
    String d = "uma";
    String a1= "umadevi";
    String num = "  ";

   




    Double k = Double.parseDouble(num);
    System.out.println(k);
    
    System.out.println(c1.compareTo(c));
    System.out.println(a1.substring(3));
    System.out.println(a1.substring(0, 3));
    System.out.println(a1.substring(3, 7));
    System.out.println(a.compareTo(b)); // op-- (-13) /  a>b (l,m,n,o,p,q,r,s,t,u,v,w.x,y)
    //difference between l in "love" and y in "you " is   13
    System.out.println(b.compareTo(a));  // op (13)  / b<a
    System.out.println(b.compareTo(c)); // op--->  (4) /b<c
    System.out.println(c.compareTo(b)); // op (-4)
    System.out.println(c.compareTo(d)); //op (0)  /c=d
    System.out.println(d.compareTo(c)); //op (0)  /d=c

    System.out.println(a+" "+b);

    a=a+b;
   //b=string(a-b);
   System.out.println(a);
  
   b=a.substring(0,a.length()-b.length());
  // a=a.substring(b.length());
   System.out.println(b);
    System.out.println(a.substring(4));
   String p = new String("meow");
    String  m= "   meow";
    String s="meow";
    String n= m+"deal";
    String mn ="meowdeal";
    System.out.println(n);
    System.out.println(n==mn);  // false  ,checks value and ref obj too

    System.out.println(m.equals(s));//true
    System.out.println(m==s);  //true
    System.out.println(m.equals(p));// true , checks values only
    System.out.println(m==p); //false ,checks value and ref  obj too
    System.out.println(m.trim());  //spaces infront and after are removed
    
    }
    
}
