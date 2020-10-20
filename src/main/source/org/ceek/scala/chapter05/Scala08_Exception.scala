package org.ceek.scala.chapter05

/**
  * 异常处理
  *
  * @author ceek
  * @create 2020-10-20 15:46
  **/
object Scala08_Exception {
  def main(args: Array[String]): Unit = {
    val i: Int = 10;

    try {
      val res = 1 / 0
    } catch {
      case ex: IndexOutOfBoundsException => println("数组越界异常捕获");
      case ex: Exception => println("最大异常捕获");
      case ex: ArithmeticException => println("算数运算错误");
    } finally {
      println("总是会打印值");
    }
  }
}
