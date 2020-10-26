package org.ceek.java.test;

/**
 * 同包类
 *
 * @author ceek
 * @create 2020-10-22 16:52
 **/
public class AccessFatherSamePackage extends AccessFather {
    public void test() {
        System.out.println(username);
    }

    public static void main(String[] args) {
//        System.out.println(username);
    }
}
