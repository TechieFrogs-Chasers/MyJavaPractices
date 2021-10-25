package Practices;


class Apple {
    private String productName;
    String releaseDate;
    int cost;

    void printProducts() {
        System.out.println("Name of the product : " + productName);
        System.out.println("Releasing date: " + releaseDate);
        System.out.println("Cost :" + cost);

    }

    final static class EncapsulationApple {

        private String productName;

        public String getProductName() {//Encapsulation
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
    }
}

class Iphone extends Apple {
    String phone;
}

class Ipad extends Apple {
    String ipad;
}

class Watch extends Apple {
    String watch;
}

class Mac extends Apple {
    String mac;
}

public class InheritanceDemo {
    private String productName;
    String releaseDate;
    int cost;

    public static void main(String[] args) {
        Apple myMainObj = new Apple();
        Apple.EncapsulationApple myEncapsulationObj = new Apple.EncapsulationApple();

        Iphone myPhoneObj = new Iphone();
        Ipad myIpadObj = new Ipad();
        Watch myWatchObj = new Watch();
        Mac myMacObj = new Mac();

        myPhoneObj.printProducts();
        myIpadObj.printProducts();
        myWatchObj.printProducts();
        myMacObj.printProducts();
    }
}
