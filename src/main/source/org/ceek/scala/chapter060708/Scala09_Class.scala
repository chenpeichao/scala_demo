package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-10-26 11:09
  **/
object Scala09_Class {
  var user1: String = _
  def main(args: Array[String]): Unit = {
    //        var user = new User09_Son();
    //    user.test("张三");
    var user = new User09_Son();
    user.test2("李四")
  }
}

abstract class User09 {
  //scala中属性也可以重写，因为属性可以抽象
  //属性只有声明，而没有初始化，那么就是抽象属性
  //抽象属性在编译class文件时，不产生属性，但是产生抽象getter方法
  val userName: String = "1"
  val age: Int = 0

  var email: String
  var addr: Int = _

  //声明抽象方法，方法只有声明，没有实现。不需要abstract关键字
  def test(userName: String);

  def test2(userName: String): Unit = {
    test(userName) //此处会调用子类的实现方法
    println("调用父类");
  }
}

//
class User09_Son extends User09 {
  override val userName: String = "2"
  override val age: Int = 10;

  var email: String = "掌上"

  def test(userName: String) {
    println("调用子类");
  }

  //scala中重写父类有方法体的方法时，需要添加override关键字
  //  override def test2(user:String): Unit = {
  //
  //  }
  def test2(userName: String, age: Int): Unit = {
  }
}