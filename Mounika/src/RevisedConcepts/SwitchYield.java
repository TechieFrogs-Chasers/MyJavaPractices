public class SwitchYield {
    public static void main(String[] args) {
       // String day = "Wed";
        
        String date = "24";
        String j =switch(date){
            case "1","8","16" ->{
                System.out.println("Monday");
                yield "Monday";
                }
                case "2","9","17" ->{
                //when we use arrows blck is need if (:) is used no need of blck for single statement
                yield "Tuesday";
                }
                case "3", "10","24"->{

                    yield "wed";
                }
                default->{
                yield "Invalid";
                } // no need of default when we use arrow
           //default -> throw new IllegalArgumentException("Unexpected value: " + date);
           //to handle the exception we used illegalargumentexception
        };//switch we are writing in expression, so we need to close it here
        System.out.println("Day is: "+j);

    }
    
}
