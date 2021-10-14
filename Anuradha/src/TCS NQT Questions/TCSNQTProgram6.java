import java.util.Scanner;

public class TCSNQTProgram6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("THANERAILWAYSTN = TH"+"\n"+"GAONDEVI = GA"+"\n" +"ICEFACTROY = IC"
        +"\n" +"HARINIWASCIRCLE = HA"+"\n" +"TEENHATHNAKA = TE"+"\n" 
        +"LUISWADI = LU"+"\n" +"NITINCOMPANYJUNCTION = NI"+"\n" 
        +"CADBURRYJUNCTION = CA");
        System.out.println("Enter Source Station :: ");
        String source = sc.nextLine();

        System.out.println("Enter Destination station :: ");
        String destination = sc.nextLine();;

        int startpoint = 0, endPoint = 0;

        float fare = 0f;

        int[] path = new int[] { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };

        String busStop[] = new String[] { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };

        for (int i = 0; i < busStop.length; i++) {
            if (busStop[i].equals(source))
                startpoint = i;

            if (busStop[i].equals(destination))
                endPoint = i;
        }

        if(startpoint == endPoint){
            System.out.println("INVALID INPUT");
        }

        for (int i = 1 ; i <= 8; i++) {

            i = i % 8;

            fare += (path[i] * 0.005);

            if (busStop[i].equals(destination)) {

                System.out.println(Math.ceil(fare) + "INR");
                break;
            }

        }
       sc.close();

    }
}
