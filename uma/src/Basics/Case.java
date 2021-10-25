public class Case {
    public static void main(String[] args) {
       /* int month=10;
        String monthName="";
        switch (month) {
            case 1:
        monthName="1-jan";
         break;
         case 2:
        monthName="2-feb";
        case 3:
        monthName="3-mar";
         break;
         case 4:
         monthName="4-april";
          break;
          case 5:
          monthName="5-may";
           break;
           case 6:
           monthName="6-june";
            break;
            case 7:
            monthName="7-july";
             break;
             case 8:
             monthName="8-aug";
              break;
              case 9:
              monthName="9-sep";
               break;
               case 10:
               monthName="10-oct";
                break;
                case 11:
                monthName="11-nov";
                case 12:
                monthName="12-dec";
                 break;
                 
            default:System.out.println("invalid");
                
        }
        System.out.println(monthName);*/
int i=10;
int j=5;
switch(i+j){
    case 1:
    System.out.println("10");
    break;
    case 15:
    System.out.println("15");
    break;
    default:
    System.out.println("Zero");
}
/* char ch='i';
 switch (ch){
    case 'b':
    System.out.println("a is an vowel");
    break;
    case'e':
    System.out.println("e is an vowel");
    break;
    case 'i':
    System.out.println("i is an vowel");
    break;
    case 'o':
    System.out.println("o is an vowel");
    break;
    case 'u': ch= 'u';
    System.out.println("u is an vowel");
    break;
    default:
    System.out.println(ch+" "+"is not an vowel");

}*/

String type="dogs";
int d=2;
switch(type){
    case "dogs":d=0;
    System.out.println(" pet type is dog");
    break;
    case "cats":d=1;
    System.out.println(" pet type is cats");
    break;
    case"birds":d=2;
    System.out.println("  pet type is birds");
    break;
    default:d=0;
    System.out.println(type+d);

}


    }
    
}
