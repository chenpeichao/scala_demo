package org.ceek.java.test;

import java.lang.reflect.Field;

/**
 * 通过反射修改string对象的值
 *
 * @author ceek
 * @create 2020-10-13 14:53
 **/
public class StringPrint {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        String abc = "wojiushiwo";

        Field value = abc.getClass().getDeclaredField("value");
        value.setAccessible(true);
        char[] values = (char[]) value.get(abc);

        values[2] = 'p';
        System.out.println(abc);
    }
}
