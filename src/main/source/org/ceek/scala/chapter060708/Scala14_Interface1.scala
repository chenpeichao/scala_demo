package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-11-02 14:01
  **/
object Scala14_Interface1 {
  def main(args: Array[String]): Unit = {
    //java中的接口无法直接构建对象，必须使用实现类
    //java中可以声明属性，属性值无法修改

    //scala的特质也无法构建对象
    //scala的特质可以执行代码
    //scala特质中声明的属性和方法都可以在混入的类中调用
    var user = new User14();
    user.test();
    println(user.username);
  }
}

trait TestTrait14 {
  println("特质中的打印");

  var username: String = _;

  //特质中可以声明抽象方法
  def test(): Unit = {
    println("特质中的类");
  }
}

class Person14 {}

class User14 extends Person14 with TestTrait14 {
  override def test(): Unit = {
    println("user实现类");
  }
}