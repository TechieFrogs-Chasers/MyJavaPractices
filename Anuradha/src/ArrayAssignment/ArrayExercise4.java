package src.ArrayAssignment;



public class ArrayExercise4 {

    public static void main(String[] args) {
        int[] intArr = new int[] {10,20,30,40,10,40,50,30,70};
        for(int n:intArr){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("Duplicate elements in given array:");
        for(int i = 0;i<intArr.length;i++){
            for(int j = i+1;j<intArr.length;j++){
                if(intArr[i] == intArr[j]){
                    System.out.print(intArr[j]+"  ");
                   
                }

            }
        }
    }
    
}
