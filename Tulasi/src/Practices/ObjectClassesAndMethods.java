package Practices;

public class ObjectClassesAndMethods {
    public static void main(String[] args) {
        Customer customerObj = new Customer();
        customerObj.setCno(15);
        customerObj.setCname("Anu");
        customerObj.method();
        System.out.println(customerObj.hashCode());
        //new Customer().method();//annonymous object

    }

    public static class Customer {
        int cno ;
        String cname ;

        public int getCno() {
            return cno;
        }

        public void setCno(int cno) {
            this.cno = cno;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public void method() {
            System.out.println("Customer Id-"+cno + " , "+"Customer name-" + cname);
        }
    }
}
