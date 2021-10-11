//package MethodAssignment.java;

class Student5 {
    String name;
    int age;
    String address;

    public Student5() {
        this.name = "unknown";
        this.age = 0;
        this.address = "Not available";
    }

    void setInfo(String name, int age) {
        System.out.println("Name is:" + name + ", His age:" + age);
    }

    void setInfo(String name, int age, String address) {
        System.out.println("Name is:" + name + ", His age is:" + age + ", Addres is:" + address);
    }

}

public class Student4 extends Student5 {
    public static void main(String[] args) {
        Student4 stu[] = new Student4[10];

        stu[0] = new Student4();
        stu[0].setInfo("India", 1974);

        stu[1] = new Student4();
        stu[1].setInfo("India", 2021, "Australia");

        stu[2] = new Student4();
        stu[2].setInfo("India", 1974);

        stu[4] = new Student4();
        stu[4].setInfo("India", 2021, "Australia");

        stu[5] = new Student4();
        stu[5].setInfo("India", 1974);

        stu[6] = new Student4();
        stu[6].setInfo("India", 2021, "Australia");

        stu[7] = new Student4();
        stu[7].setInfo("India", 1974);

        stu[8] = new Student4();
        stu[8].setInfo("India", 2021, "Australia");

        stu[9] = new Student4();
        stu[9].setInfo("India", 1974);

    }

}
