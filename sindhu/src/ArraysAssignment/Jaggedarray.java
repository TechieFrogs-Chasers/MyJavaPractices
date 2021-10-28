package sindhu.src.ArraysAssignment;

public class Jaggedarray{

    public static void main(String[] args) {

        int x[][] = new int[2][]; //declaring 2d array with 2 rows

        x[0] = new int[4];  //first row has 4 columns

        x[1] = new int[5];  //second row has 5 columns

        int count =0;

        for(int i=0; i<x.length; i++){

            for(int j=0; j<x[i].length; j++){

                x[i][j] = count++;
            }
        }

        System.out.println("elements of 2d arrray");

        for(int i=0;i<x.length;i++){

            for(int j=0; j<x[i].length; j++){

                System.out.println(x[i][j]);
            }

            System.out.println();
        }


        
    }
}