package org.ceek.scala.chapter05

/**
  * scala传值调用和传名调用
  * 传值：先计算参数函数，将结果传入调用函数
  * 传名：不执行参数函数，直接在调用函数内执行参数函数，多处调用，一致
  *
  * @author ceek
  * @create 2020-10-20 14:17
  **/
object Scala07_FUnctionNameAndValue02 {
  def main(args: Array[String]): Unit = {
    var money = 10;
    def test(age: Int) = {
      money -= age;
      money
    }

    def buyByName(count: => Int) {
      print(count)
      println(count)
    }
    def buyByValue(count: Int) {
      print(count)
      println(count)
    }

    buyByName(test(2)) //86
    buyByValue(test(2)) //44
  }
}
