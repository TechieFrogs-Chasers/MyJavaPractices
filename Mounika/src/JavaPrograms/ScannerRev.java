package JavaPrograms;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerRev {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        //scObj.useDelimiter("/");
            System.out.println("Enter name");
            String str = scObj.next();
                System.out.println("Name :"+str);

                System.out.println("Enter Id");
                int id = scObj.nextInt();
                    System.out.println("ID : "+id);

                    Scanner obj = new Scanner("Hello Everyone, How are you");
                    //char c = obj.nextLine().charAt(12);
                    //System.out.println(c);
                    //String s = obj.findInLine("Everyone");
                        String si = obj.findInLine(Pattern.compile(".ello"));// findinline(pattern Pattern)
                        //.(dot) prints the before letter h also
                        //Patern is in  import java.util.regex.Pattern;
                            //System.out.println(s);
                            System.out.println(si);
                            String rest = obj.nextLine();
                                System.out.println(rest);

                                String st="Myself Mounika, Hi Everyone";
                                Scanner Scannerobj = new Scanner(st);
                                    System.out.println("Result:"+Scannerobj.hasNextBigInteger());
                                    System.out.println("String : "+Scannerobj.nextLine());

                                    System.out.println(Scannerobj.delimiter());
                                    //Scanner Scannerobj1 = new Scanner("");
}
    
}
