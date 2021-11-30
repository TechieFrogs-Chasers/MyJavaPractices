package Collections.ListAssignment;

public class Assignment_34_UserDefine implements Comparable<Assignment_34> {


    int cNo;
    String cName;
    String customerAdd;

    public int getcNo() {
        return cNo;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCustomerAdd() {
        return customerAdd;
    }

    public void setCustomerAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }

    public Assignment_34_UserDefine(int cNo, String cName, String customerAdd) {
        this.cNo = cNo;
        this.cName = cName;
        this.customerAdd = customerAdd;
    }

    @Override
    public String toString() {
        return "Assignment_34_UserDefine{" +
                "cNo=" + cNo +
                ", cName='" + cName + '\'' +
                ", customerAdd='" + customerAdd + '\'' +
                '}';
    }

    public int compareTo(Assignment_34_UserDefine customer) {
        if (this.cNo > customer.getcNo()) {
            return 1;
        } else if (this.cNo < customer.getcNo()) {
            return -1;
        }
        return 0;
    }

    @Override
    public int compareTo(Assignment_34 o) {
        return 0;
    }
}