package Arrays;

public class Assignment_2 {
    public static void main(String[] args) {
        boolean[] eleBoolean = {true, false, false, false, true, false, true, true, false, true, false, true};
        int count = 0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < eleBoolean.length; i++) {
            System.out.print(eleBoolean[i] + " , ");
        }

        System.out.println();
        for (boolean elementBoolean : eleBoolean) {
            if (!elementBoolean) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("Frequence of: " + true+"-" + "and its frequence occurence :" + count + " times. ");
        count=0;
        for (boolean elementBool:eleBoolean){
            if(elementBool){
                count++;
            }
        }
        if(count>0)
            System.out.println("Frequence of: " + false +"-"+ "and its frequence occurence :" + count + " times. ");

    }
}

