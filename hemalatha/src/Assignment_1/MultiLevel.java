package Assignment_1;

    
    class College{
        int students;
       private String name;
        void name(){
            System.out.println("name of the college:"+name);
        }
    }
    class Faculty extends College{
         private int salary;
        String address;
        void professor(){
            System.out.println("professor salary:"+salary);
        }
    }
    class StudentHema extends College{
        int marks;
         protected String subject;
        void course(){
            System.out.println("maths subject marks:"+marks);
        }
    }
    public class MultiLevel {
    public static void main(String[] args) {
        StudentHema stu = new StudentHema();
        stu.course();
        //stu.professor();
        stu.name();
    }
}

/* this program is example for both multilevel and heirarchical inheritence with small changes*/


    
    


