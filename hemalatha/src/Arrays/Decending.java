package Arrays;

public class Decending {
    public static void main(String[] args) {
        int a[]=new int[]{2,4,6,3,9,5};
        int temp=0;
        System.out.println("elements of the array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
            System.out.println(" ");
          System.out.println("elements of array in decending order");
                for(int i=0;i<a.length;i++){
                    System.out.print(a[i]+" ");

                }

            }
        }

        
       
    
    

