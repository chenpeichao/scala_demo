package org.ceek.java.test;

/**
 * java基本数据类型转换
 *
 * @author ceek
 * @create 2020-10-13 10:56
 **/
public class DataType {
    public static void main(String[] args) {
        short s1 = 2;
//        char c1 = 1;
        short s2 = 1 + '0';
//        int s3 = '4' - '0';//都会先转成int型值，再进行运算
//        int s4 = '4';
//        int s5 = '0';
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s5);

//        byte的转换类型为byte(1字节byte，8位bit)->short(2字节16位)->int(4字节)->long(8字节)->float(4字节)->double(8字节)
//        char的转换类型char(2字节)->int->long->float(4字节)->double(8字节)
        byte b = 1;
        test(b);
        char c = 1;
        test(c);
    }

    //    public static void test(char c) {
//        System.out.println("ccccccc");
//    }
//    public static void test(byte b) {
//        System.out.println("bbbbbb");
//    }
    public static void test(short s) {
        System.out.println("ssssss");
    }

    public static void test(int i) {
        System.out.println("iiiii");
    }

    //    public static void test(long l) {
//        System.out.println("LLLLLLL");
//    }
    public static void test(float f) {
        System.out.println("fffffff");
    }

    public static void test(double d) {
        System.out.println("ddddddd");
    }
}
