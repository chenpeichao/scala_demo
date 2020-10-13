package org.ceek.java.test;

/**
 * 两数交换
 *
 * @author ceek
 * @date 2020/10/13 22:57
 */
public class SwapNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "=" + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "=" + b);
    }
}