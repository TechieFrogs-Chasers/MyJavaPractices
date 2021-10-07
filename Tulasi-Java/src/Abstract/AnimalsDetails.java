package Abstract;//Package

abstract class Animals{//abstract class
    abstract void cats();//first abstract method-method should not have body
    abstract void dogs();//second abstract method-method should not have body
}
 class Cats extends Animals{//first subclass
    public void cats(){//cat method
        System.out.println("Cats meow");
    }
    public void dogs(){//dog method
        System.out.println();
    }
}
class Dogs extends Animals{//second subclass
    public void dogs(){//dog method
        System.out.println("Dogs bark");
    }
    public void cats(){//cat method
        System.out.println();
    }
}

public class AnimalsDetails {//Driver class
    public static void main(String[] args) {//main method
        Cats catsObj=new Cats();//Instance for first subclass
        catsObj.cats();//call cat method
        Dogs dogsObj=new Dogs();//Instance for second subclass
        dogsObj.dogs();//call dog method
    }
}
