package Collections.ListAssignment;

public class UserClass {
    String name;
    String add;
    int hNo;
    public UserClass(){
    }
    public UserClass(String name,String add,int hNo){
        this.name=name;
        this.add=add;
        this.hNo=hNo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int gethNo() {
        return hNo;
    }

    public void sethNo(int hNo) {
        this.hNo = hNo;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", hNo=" + hNo +
                '}';
    }
}
