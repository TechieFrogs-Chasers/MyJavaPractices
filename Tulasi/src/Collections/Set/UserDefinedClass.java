package Collections.Set;

public class UserDefinedClass {

        int rollNo;
        String name;
        String subject;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserDefinedClass(int rollNo, String name, String subject) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "UserDefinedClass{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

}

