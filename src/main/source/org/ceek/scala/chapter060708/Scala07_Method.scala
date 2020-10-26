package org.ceek.scala.chapter060708

/**
  * 方法类似于函数，只是调用方式上稍有区别
  *
  * @author ceek
  * @create 2020-10-23 14:37
  **/
object Scala07_Method {
  def main(args: Array[String]): Unit = {
    val scala07_Method = new Scala07_Method()
    scala07_Method.login()
  }
}

class Scala07_Method {
  def login(): Unit = {
    println("我就是我");
  }
}