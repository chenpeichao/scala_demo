package org.ceek.java.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ceek
 * @date 2020/11/18 20:17
 */
public class Java16_Class {
    public static void main(String[] args) {
        //所谓的泛型，其实是对类型的约束
        /*List<Person16> person16List = new ArrayList<Person16>();
        person16List.add(new User16());

        System.out.println(person16List);*/
        //java中的泛型不变性
//        List<Person16> person16List = new ArrayList<User16>();//泛型定义错误

        List person16List = new ArrayList<Person16>();

        person16List.add(new User16());

        List<Animal> personList = person16List;
        personList.add(new Animal());

        //由于没有具体使用，所以集合类型不出错
        System.out.println(personList);
    }
}

class Person16 {
}

class User16 extends Person16 {
}

class Animal {
}