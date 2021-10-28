

public class IsNumeric {
    public static void main(String[] args) {
        String string = "12345.15";
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
            System.out.println(num);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");


	    /* String num1 = "a10c";
	     String num2 = "-104";
	     String num3 = "100";
	     String num4 = "0xA10";

	     System.out.println("String " + num1 + " is numeric: " + NumberUtils.isCreatable(num1));
	     System.out.println("String " + num2 + " is numeric: " + NumberUtils.isCreatable(num2));
	     System.out.println("String " + num3 + " is numeric: " + NumberUtils.isCreatable(num3));
	     System.out.println("String " + num4 + " is numeric: " + NumberUtils.isCreatable(num4));*/

    }
}
