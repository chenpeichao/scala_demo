package org.ceek.scala.chapter060708

/**
  * scala中的构造方法
  * scala是完全面向函数的，所以类也是函数，在类后面添加参数就是主构造方法
  * scala中可以调用辅助构造方法，但是调用之前必须调用主构造方法
  * scala的对象可以通过辅助构造方法创建，在主构造方法中声明的构造方法就是辅助构造方法
  *
  * @author ceek
  * @create 2020-10-26 10:51
  **/
object User08 {
  def main(args: Array[String]): Unit = {
    var user08 = new User08("李四");
  }
}

class User08(var userName: String, var age: Int) {
  println("名称为：" + userName + "，年龄为：" + age)
  println("调用主构造方法");

  def this(age: Int) {
    //调用主构造方法的this之前，不能添加代码，报错
    this("lisi", age);
    println("调用辅助构造方法");
  }

  def this(userName: String) {
    //调用主构造方法的this之前，不能添加代码，报错
    this(userName, 10);
    println("调用辅助构造方法");
  }
}

