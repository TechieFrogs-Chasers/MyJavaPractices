public class AreaSquRec {

    public void area(int s){

        System.out.println("Area of square is: "+(s*s));

    }
    public void area(int l ,int b){

        System.out.println("Area of Rectangle is: "+(l*b));

    }
    public static void main(String[] args) {
        
        AreaSquRec squrecObj = new AreaSquRec();
        squrecObj.area(5);
        squrecObj.area(5, 6);
    }
}
