package org.ceek.scala.chapter01

/**
  *
  *
  * @author ceek
  * @create 2020-10-13 10:06
  **/
object Scala01_HelloWorld {
  //scala源码中包含了main方法，在编译后自动形成了public static void main
  //scala在编译源码时，会生成两个字节码文件，静态main方法执行另外一个字节码文件中的成员main方法
  //scala是完全的面向对象的语言，那么就没有静态的语法，只能通过模拟生成静态方法
  //编译时将当前类生成一个特殊的类Scala01_HelloWorld$，然后创建对象来调用这个对象的main方法

  //一般情况下，将加$的类的对象，称之为"伴生对象"
  //伴生对象中的内容，都可以通过类名访问，来模拟java中的静态语法

  //伴生对象的语法规则，使用object声明
  //scala中没有public关键字，默认所有的访问权限都是公共的
  //scala中没有void关键字，采用特殊的对象模拟：Unit
  //scala中声明方法采用关键字def

  //scala中形参列表中的声明方式和java中不一样(scala中更注重名称；java中更注重类型)
  //java：String 参数名
  //scala：参数名：类型

  //scala中方法的声明和方法体时通过等号连接

  //scala中将方法的返回值类型放置在方法声明的后面，使用冒号连接
  def main(args: Array[String]): Unit = {
    println("Hello world!");
  }
}