package Interfacefolder;

import jdk.internal.module.SystemModuleFinders;

// The classes declared inside the interface must be only public or by deafult it is public.
// we cannot have protected classes.
public interface NestedClass{
    int i=1,j=2,k=3;

class ClassinsideInterface{
 ClassinsideInterface(){
     System.out.println("Inside nestedclass of an interface:");
 }
}
    
}
