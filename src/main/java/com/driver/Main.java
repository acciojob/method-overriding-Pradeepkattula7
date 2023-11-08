package com.driver;
class A
{
  public String meth()
   {
        return "Invoking method from class A";
   }
}
class B extends A{

    public String method(){
       return super.meth();
    }

   public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {

    public static void main(String[] args) {

        B obj=new B();

        System.out.println(obj.method());

        System.out.println(obj.meth());

    }
}