import java.util.Scanner;


public class AlphaOrNot {
    public static void main(String[] args) {
        char ch;
        String str;
        Scanner alphaObj = new Scanner(System.in);
        do{
            System.out.println("Enter some character ");
            String abc =alphaObj.nextLine();
                if(abc.length()>1){
                    System.out.println("please enter single character only");
                }
                ch = alphaObj.next().charAt(0);
                    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                        System.out.println("Given Value is Alphabet");
                    }
                        else if((!(ch>='A' && ch<='Z') || (ch>='a' && ch<='z')))
                            System.out.println("Given Value is not Alphabet");
                                else if((ch>=91 && ch<=96) || (ch>=123 && ch<=255)){
                                    System.out.println("Given Value is not Alphabet");
                                }
                                    else{
                                        System.out.println("Enter some character ");
                                    }  
                            
        }while(ch<65);
        alphaObj.close();
    }
}

    
