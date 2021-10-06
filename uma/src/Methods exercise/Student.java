public class Student {
    
    String name;
    String address;
    int age;

    Student(){
        System.out.println(name+" "+age+"  "+address);
    }

    void setInfo(String name,int age){

    }
    void setInfo(String name, int age, String address){

    }
    public static void main(String[] args) {
        Student objStudent = new Student();
        objStudent.setInfo("uma", 41, "st.louis");
        objStudent.setInfo("uma", 41);
    }
}
