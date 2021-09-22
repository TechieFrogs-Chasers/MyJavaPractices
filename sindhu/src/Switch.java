/*public class Switch {
    public static void main(String[] args){
        switch("friday"){
            case "monday":
            System.out.println("first");
            break;
            case "tuesday":
            System.out.println("second");
            break;
            case "wednesday":
            System.out.println("third");
            break;
            case "thursday":
            System.out.println("fourth");
            break;
            case "friday":
            System.out.println("fifth");
            break;
            default:
            System.out.println("sixth");

        }


    }
    
}*/

/*public class Switch {
    public static void main(String[] args){
        int day =2;
        switch(day){
            case 0:
            System.out.println("monday");
            break;
            case 1:
            System.out.println("tuesday");
            break;
            case 2,3,4:    //it supports multiple valus per case
            System.out.println("wednesday");
            break;
            default:
            System.out.println("invalid");

        }
    }
}*/
public class Switch {
    

    public static int main(String[] args){
    String e;
    String mode=e;
        int result = switch (mode) {
            case "a", "b":
                yield 1;
            case "c":
                yield 2;
            case "d", "e", "f":
                // do something here...
                System.out.println("Supports multi line block!");
                yield 3;
            default:
                yield -1;
        };
        return result;
    }
}
