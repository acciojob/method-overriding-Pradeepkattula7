package com.driver;
class A{
   String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    void method(){
        super.meth();
    }
   String meth(){
        return "Method is overridden in Extendend class B";
   }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();
       b.method();
       b.meth();
    }

}