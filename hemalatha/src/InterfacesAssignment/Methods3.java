package InterfacesAssignment;


    interface OwnPackage {
        public abstract void m1();
        public abstract void m2();
        public abstract void m3();
    }
    class Different implements OwnPackage{
        public void m1()
        {
            System.out.println("welcome");
        }
        public void m2()
        {
            System.out.println("interfaces");
        }
        public void m3()
        {
            System.out.println("in java");
        }
        public static void main(String[] args) {
            Different diff = new Different();
            diff.m1();
            diff.m2();
            diff.m3();
        }
        
    
        
    }
    
    

