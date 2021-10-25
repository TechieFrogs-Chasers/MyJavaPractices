package Practices;//Package

//Security or Less scope--Private(only in class)-->Default(only in package)-->Protected(allows outside the package once we use inheritance)-->Public(can use anywhere)
//Widest scope--Public-->Protected-->Default-->Private
class AccessModifiers {//Driver Class- We cant give top or driver class as Private or Protected .Driver class can accept only public,abstract,final and default(without giving any access modifiers)are permitted.
    int num;//If we are giving any access modifier means its a default access modifier.If u define them as default then it is only access in same package (like Practies)
    private String name;//Private datatype

    void accessMethod() {//Default access modifier for method.Default is access only in same package.Protected is also not able to access outside the package by using the inheritance we can access outside the package, by using extends.
        System.out.println("Its a default accessmethod");
    }

    //Private means" Only visible within the enclosing class".We can give Private to inner and nested classes.Top level and outside class we cant give Private.
    private void accessMethods() {//If we made it private we cant access out side the class-method or we can not create instance as well of that class.
        System.out.println("Its a Private accessmethod");
    }

    private AccessModifiers() {//If we made it private we cant access out side the class-Constructor or we cant not create instance as well of that class.
        System.out.println("Its a Private accessmodifier constructor");
    }

    public static void main(String[] args) {//Main
        System.out.println(" In accessmodifiers!");
        AccessModifiers myAccessObj = new AccessModifiers();//we can create a obj for AccessModifiers constructor.Because we are creating instance in same class.
        myAccessObj.accessMethods();//-Here Private access modifier is accessable because it is in your class.Private can access only in your class.

    }
}
