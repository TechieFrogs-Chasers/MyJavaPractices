public class EnhanceSwitch {
    public static void main(String[] args) {
        String amount = "A";
        Integer d = 5;//wrapper
        int i = 10;
        char ch='a';
        switch (amount) {
            case "A", "B", "C", "D"://multiple cases
                System.out.println(amount);
                //break;
            case "1":
                switch (d) {//Nested Switch
                    case 5, 6, 7, 8:
                        System.out.println(d);
                       //break;
                    case 2:
                        switch (i) {
                            case 9, 10, 11, 12:
                                System.out.println(i);
                                   //break;

                            case 20, 21, 30:
                                System.out.println(d);
                                 //break;

                            default:
                                System.out.println("default");
                        }
                    case 3:
                       switch (ch){
                           case 'a':
                               System.out.println(ch);
                              // break;
                           default:
                               System.out.println("ch:"+ ch);
                       }
                    default:
                        System.out.println("In case -1 default");
                }
                default:
                System.out.println("Unexpected value: " + amount);
        }

    }
}