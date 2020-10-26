package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-10-26 11:09
  **/
object Scala09_Class {
  def main(args: Array[String]): Unit = {
    var user = new User09_Son();
    user.test("张三");
    user.test2("李四")
  }
}

abstract class User09 {
  //声明抽象方法，方法只有声明，没有实现。不需要abstract关键字
  def test(userName: String)

  def test2(userName: String): Unit = {
    test(userName) //此处会调用子类的实现方法
    println("调用父类");
  }
}

class User09_Son extends User09 {
  def test(userName: String) {
    println("调用子类");
  }
}