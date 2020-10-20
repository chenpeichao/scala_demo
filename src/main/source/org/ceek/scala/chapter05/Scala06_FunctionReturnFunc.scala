package org.ceek.scala.chapter05

/**
  *
  *
  * @author ceek
  * @create 2020-10-20 10:23
  **/
object Scala06_FunctionReturnFunc {
  def main(args: Array[String]): Unit = {
    def test(i: Int): Int => Int = {
      (y: Int) => i * i * y * y
    }

    println(test(3));
    println(test(3)(2));
    println(test _);

    def a = () => {}
    println(a)

    def addBy(n: Int) = {
      (d: Double) => n + d
    }

    println(addBy(2)(3));
  }


}
