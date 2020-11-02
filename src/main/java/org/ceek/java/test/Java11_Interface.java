package org.ceek.java.test;

/**
 * 动态绑定机制
 *
 * @author ceek
 * @create 2020-10-27 9:48
 **/
public class Java11_Interface {
    public static void main(String[] args) {
        A a = new B();
        //动态绑定
        //成员方法在执行过程中，jvm会将方法和当前调用对象实际内存进行绑定
        //属性没有动态绑定机制，属性在哪里声明就在那里使用
        System.out.println(a.getResult());
    }
}

class A {
    public int i = 10;

    public int getResult() {
        return i + 10;
    }
}

class B extends A {
    public int i = 20;
//    public int getResult() {
//        return i+20;
//    }
}