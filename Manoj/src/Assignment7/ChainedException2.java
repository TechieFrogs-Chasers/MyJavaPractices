package Assignment7;

public class ChainedException2 {
    public static void main(String[] args) {
        try {
            NumberFormatException n=new NumberFormatException("====> exception ");
           n.initCause(new NullPointerException("===> actual cause of the excetpion"));
            throw n;
        }
        catch(NumberFormatException a) {
           System.out.println(a);
           System.out.println(a.getCause());

        }
    }
    
}
