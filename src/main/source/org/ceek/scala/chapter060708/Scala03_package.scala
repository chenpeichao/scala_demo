package org.ceek.scala.chapter060708

/**
  * scala是一个完全面向对象的语言
  *
  * @author ceek
  * @create 2020-10-20 16:11
  **/
// scala中的包声明方式默认和java是一致的，但是有其它的使用方式
//1)、在同一个源码文件，可以多次声明
//  声明的类在最后的那个包中
//  源码中的类所在的位置不需要和包路径相同
//2)、scala中所有的语法都可以进行嵌套
//  package可以使用小括号，小括号内声明的类在这个包中，之外声明的类不在这个包中
//3)、scala中可以声明父包和子包，父包中的类，子类可以直接访问访问，不需要引入，其实就是作用域的概念
//4)、scala中package可以声明类，但是无法声明变量和函数(方法)
//5)、scala为了弥补包的不足，使用了包对象的概念，其中可以声明属性和方法
object Scala03_package {
  //
}
