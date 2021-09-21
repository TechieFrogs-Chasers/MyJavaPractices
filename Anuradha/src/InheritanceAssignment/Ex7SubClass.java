

    public class Ex7SubClass  extends Ex7Class {   //Ex7Class from ClassObject Assignment

        public static void main(String[] args) {
            Ex7Class exObj = new Ex7Class();
            InnerEX7Class innObj = exObj.new InnerEX7Class();
            innObj.innerEx7Method();
            innObj.num();
        }
    
}
