package org.ceek.java.test;

/**
 * @author ceek
 * @date 2020/11/16 19:39
 */
public class Java13_switch {
    public static void main(String[] args) {
        int i = 11;
        //穿透现象
        switch (i) {
            default:
                System.out.println("default");
            case 10:
                System.out.println("first");
            case 11:
                System.out.println("second");
                break;
            case 12:
                System.out.println("third");

        }
    }
}