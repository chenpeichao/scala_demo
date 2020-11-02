package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-10-29 15:58
  **/
object Scala10_Class1 {
  def main(args: Array[String]): Unit = {
    //输出：父类-子类-掌上生活
    var person = new Person10_son();
  }
}

class Person10 {
  println("父类构造方法");

  def this(userName: String) {
    this()
  }
}

class Person10_son extends Person10 {
  var s: String = "";
  println("子类构造方法");

  def this(userName: String) {
    this()
    println(userName)
  }
}