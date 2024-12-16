package com.driver;

public class Main {
    //    Task 1:
//    create a class A, with a method named meth having returning a string
//"Invoking method from class A"
    public static   class A{
        public String meth(){
            return "Invoking method from class A";
        }

    }
    //    Task 2:
//    create a class B which extends A
    public static class B extends A{
//    Task 4:
//    Now override methode meth of class A in class B, which returns the following string
//"Method is overridden in Extendend class B"

        @Override
        public  String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
//        Task 3:
//        create object of class B and call method meth of class A with it
        B obj= new B();
        obj.meth();
//        Task 5:
//        call this overridden method from obj of class B */
        B obj1= new B();
        obj1.meth();
    }

}