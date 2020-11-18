package org.ceek.java.test;

import org.ceek.scala.chapter060708.Person;

import java.util.List;

/**
 * @author ceek
 * @date 2020/11/18 20:38
 */
public class Java17_Class1 {
    public static void main(String[] args) {
        Java17_Class1 tmp = new Java17_Class1();
        tmp.test(User17.class);
        tmp.test1(Plant.class);
    }

    //extends体现类的体系树的上限
    public void test(Class<? extends Person17> clazz) {
        System.out.println(clazz);
    }

    //super表示类的体系树的下限
    public void test1(Class<? super Person17> clazz) {
        System.out.println(clazz);
    }
}

class Plant {
}

class Person17 extends Plant {
}

class User17 extends Person17 {
}