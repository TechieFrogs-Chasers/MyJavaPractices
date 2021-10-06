package Practices;//Package

abstract class Books {//abstract class
    private int num;//private variable

    abstract void numBooks();//abstract method

    public int getNum() {//getter for private variable
        return num;
    }

    public void setNum(int num) {//setter for private variable
        this.num = num;
    }

    private final void numStores() {//private final method
        System.out.println("Number of books stores.");
    }

    protected static void numSales() {//protected static method
        System.out.println("No.of books sold!");
    }

    Books() {//abstract class constructor
        System.out.println("Constructor!");
    }

    public static void main(String[] args) {//main method
        Books obj = new Books() {//Instance for abstract -anonymous way
            void numBooks() {//Implimentation abstract method
                System.out.println("Books.");
            }
        };
        // Stores obj1 = new Stores();//Instance for subclass
        // obj1.bookStores();
        obj.numBooks();
        obj.numStores();
        obj.numSales();
        obj.setNum(4);
        System.out.println("No.of branches: " + obj.getNum());
    }
}

//Extend abstract class
class Stores extends Books {
    public void bookStores() {//method for subclass
        System.out.println("Total number of bookstores.");
    }

    Stores() {//subclass constructor
        System.out.println("Subclass constructor!");
    }

    void numBooks() {//Implimentation of abstract method
        System.out.println("Books.");
    }
}

public class AbstractDemo {//Driver class

    public static void main(String[] args) {//Second main method
        Stores obj1 = new Stores();//Instance for subclass
       /* Books obj = new Books() {//Instance for abstract class-anonymous way
            void numBooks() {//Implimentation of abstract method
                System.out.println("Number of books!");
            }
        };*/
        obj1.bookStores();
        obj1.numBooks();
        obj1.setNum(4);
        System.out.println("No.of branches: " + obj1.getNum());
        // obj.numStores();-Gave private access modifier ,so we cant access outside that class.

    }
}