public class SwitchString {
    public static void main(String[] args) {
        int month=8;
        String monthname="";
        //char n1='A';
        switch(month){
            case 1: monthname="1-Jan";
                break;
            case 2: monthname="2-feb";
                break;
            case 3: monthname="3-mar";
                break;
            case 4: monthname="4-apr";
                break;
            case 5: monthname="5-may";
                break;
            case 6: monthname="6-june";
                break;
            case 7: monthname="7-july";
                break;
            case 8: monthname="8-aug";

            case 9: monthname="9-sep";
                break;
            case 10: monthname="10-oct";
                break;
            case 11: monthname="11-nov";
                break;
            case 12: monthname="12-dec";
                break;
            default:
                System.out.println("invalid month!");
        }
        System.out.println(monthname);
    }
}
