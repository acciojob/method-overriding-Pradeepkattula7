package com.driver;
class A{
   String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
   String meth(){
       super.meth();
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();
       b.meth();
    }

}