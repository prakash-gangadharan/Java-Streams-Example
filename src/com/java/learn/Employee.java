package com.java.learn;

public class Employee implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee();
        Employee e2 = (Employee) e1.clone();

        System.out.println(e1.equals(e2)); // false
        System.out.println(e1 == e2); // false

        Employee e3 = new Employee();
        Employee e4 = new Employee();

        System.out.println(e3.equals(e4)); //false
        System.out.println(e3 == e4); //false

        Employee e5 = e4;

        System.out.println(e4.equals(e5)); // true
        System.out.println(e4 == e5); // true

        System.out.println(e1); // Employee@6ce253f1
        System.out.println(e2); // Employee@53d8d10a
        System.out.println(e3); // Employee@e9e54c2
        System.out.println(e4); // Employee@65ab7765

    }
}
