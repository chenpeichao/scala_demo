package org.ceek.java.test2;

import org.ceek.java.test.AccessFather;

/**
 * 操作权限子类
 *
 * @author ceek
 * @create 2020-10-22 16:50
 **/
public class AccessSon extends AccessFather {
    public void test() {
        System.out.println(username);
    }

    public static void main(String[] args) {
//        new AccessFather().username;
//        System.out.println(username);
    }
}
