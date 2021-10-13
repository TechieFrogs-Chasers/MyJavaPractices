public interface OldInterface {
    
        default void display(){
            System.out.println("In old interface default");
        }
        static void sampleStatic(){
            System.out.println("INSIDE STATIC METHOD ");
        }
        class ClassInsideInterface{
            public void normalMethod(){
                System.out.println("Hi, am class inside the interface:");
            }
        }
        public static void main(String[] args) {
            OldInterface.display(); //CAN'T ACCESS THE DEFAULT METHOD OF INTERFACE INSIDE THE SAME INTERFACE FILE.
            sampleStatic(); 
            //or 
            OldInterface.sampleStatic();     //bcz we cant create object for interface. that's why., but we can access static method
                // bcz static method doesnt need object reference.
        }

}
