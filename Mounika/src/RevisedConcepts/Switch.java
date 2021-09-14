import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int year = 1992;
        String month = "October";
        String Name = "Mounika";
        byte date = 24;
        switch(month){
            case "January":
            System.out.println("1st Month January");
            break;
        case "Feb":
            System.out.println("2nd Month Feb");
            break;
        case "March":
            System.out.println("3rd Month March");
            break;
        case "April":
            System.out.println("4th Month April");
            break;
        case "October":{
            System.out.println("10th Month October");
            System.out.println(Name);
            System.out.println("DOB : "+date+" "+month+" "+year);
        }
            break;
        // here if break is not there fall through occur and nxt condition also executes
        case "Nov":
                System.out.println("11th Month Nov");
            default:
        System.out.println("Not Matching");

    }
            switch(date){
    // printing single statement for multiple cases
                case 1, 8, 15, 22, 29-> System.out.println("Wednesday");
    // break; not required when we use arrow
                case 2, 9, 16, 23, 30-> System.out.println("Thursday");
                case 3, 10, 17->System.out.println("Friday");
    //  default: //not required when we use arrow
                case 24->{
                    System.out.println("Saturday");
                    int i = 200;
                    int j = 300;
                    int k = 400;
                    System.out.println(i>j | k>j);// bitwise or check both condition 
                    System.out.println(10<<3);//left shift operator//10*2^3=10*8
                    int age;
                    byte weight;
                    Scanner scObj = new Scanner(System.in);
                    age = scObj.nextInt();
                    weight = scObj.nextByte();
                        if(age>20){
                            if(weight>40){
                                System.out.println("Eligible for Sports");
                            }
                            else{
                                System.out.println("Not Eligible for Sports"); 
                            }
                        }// age condition if closed
                        scObj.close();
                }//case close
  
            }//switch close
    }//method close
}// class close

    

