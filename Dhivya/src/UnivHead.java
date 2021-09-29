public class UnivHead {//outer class
    String name = "California University";
    static int rec_no=3040;
    public class College{   // first nested class
        static String cname = "Berkeley_college";
        public College(){   // constructor
            System.out.println("Inside the first nested class college constructor:  " + cname);
        }
        public void CollegeMethod(){  //method
            System.out.println("In First Inner class method : " + cname + " & "+ rec_no);
        }
        private class Physics{  // first innermost nested class
            void PhysicsMethod(){ //method
                System.out.println("Inside the first innermost class college: physics");
            }
        }
    }
   public class School{     //second nested class
       String sname = "Lincoln Public school";
        void SchoolMethod(){ //method
            System.out.println("In Second Inner class method: School" + sname);
        }
        private class Elementary{ // second innermost class
            String Ename = "Maxey Elementary";
            private int totalstrength = 2000;
            void ElementaryMethod(){ //second innermost method
                System.out.println("Inside Second Innermost class method School:  " + Ename +" & " + totalstrength);   
            }
        }    
    }
    public void UnivMethod(){       //outer class method
        System.out.println("In outer class method -university ");
    }
    public static void main(String[] args) {

        System.out.println("The output are as follows:");
        UnivHead outerobj = new UnivHead();//Instance for the outer class-univhead
        outerobj.UnivMethod();//Method calling of outerclass
        
        UnivHead.College innerobj = outerobj.new College();//Instance for nested class1
        UnivHead.School secondinnerobj = outerobj.new School();//Instance for nested class2
        
        innerobj.CollegeMethod();//calling first nested class method
        secondinnerobj.SchoolMethod();// calling second nested class method

        UnivHead.College.Physics  innerobj2 = innerobj.new Physics();//Instance for innermost class of first one
        UnivHead.School.Elementary secondinnerobj2 = secondinnerobj.new Elementary();
        
        innerobj2.PhysicsMethod();
        secondinnerobj2.ElementaryMethod();
        System.out.println("The total strengt of the school is :" + secondinnerobj2.totalstrength);
    }
}


