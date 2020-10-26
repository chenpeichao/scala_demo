package org.ceek.java.test;

/**
 * helloworld测试
 *
 * @author ceek
 * @create 2020-10-13 10:15
 **/
public class HelloWorld {
    public static void main(String[] args) {
        int a = 0;
        a = a++;    //0

        int b = 0;
        b = ++b;    //1
        System.out.println(a);      //0
        System.out.println(b);      //1

    }
}