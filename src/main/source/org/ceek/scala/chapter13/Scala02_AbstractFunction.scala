package org.ceek.scala.chapter13

import scala.util.control.Breaks

object Scala02_AbstractFunction {
  def main(args: Array[String]): Unit = {
    Breaks.breakable {
      for (i <- 1 to 10) {
        if (i == 5) {
          Breaks.break();
        }
        println(i);
      }
    }

    //函数作为参数传递给另外一个函数，如果这个函数不需要参数，也不需要返回值，那么可以直接传递代码逻辑
  }
}
