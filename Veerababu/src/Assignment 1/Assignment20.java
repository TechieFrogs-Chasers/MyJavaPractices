public class Assignment20 {
    public static void main(String[] args) {
        int k=5;
        for(int i=1;i<=5;i++){
            for(int j=5; j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Inverted Half Pyramid");
    }
}
