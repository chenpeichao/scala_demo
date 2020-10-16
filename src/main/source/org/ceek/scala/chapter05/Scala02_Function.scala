package org.ceek.scala.chapter05

/**
  *
  *
  * @author ceek
  * @create 2020-10-16 13:51
  **/
object Scala02_Function {
  //TODO scala中无throws关键字，所以函数中如果有异常发送，也不需要在函数声明时抛出异常
  def test1(): Unit = {
    println("无参无返回值")
  }

  def test2(i: Int): Unit = {
    println("有参无返回值")
  }

  def main(args: Array[String]): Unit = {
    def test1(): Unit = {
      println("无参无返回值")
    }

    def test2(i: Int): Unit = {
      println("有参无返回值")
    }

    def test3() = {
      "无参有返回值"
    }

    def test4(i: Int): Unit = {
      "有参有返回值"
    }
    println("1111")
  }
}
