package org.ceek.scala.chapter03

import util.control.Breaks._;

/**
  * 流程控制
  *
  * @author ceek
  * @create 2020-10-14 15:06
  **/
object Scala04_FlowController {
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 10) {
      print(i);
    }
    println("")
    for (i <- 0.until(10)) {
      print("循环打印" + i + "\t")
    }

    for (i <- Range(0, 5)) {
      print(i + "\t")
    }
    println();

    for (i <- 1 to 10; j <- 2 to 20) {
      print(i + "" + j);
    }
    println()
    //可以通过大括号加每个表达式加换行符替换for循环中添加分号
    for {i <- 1 to 10
         j <- 2 to 20} {
      print(i + "" + j);
    }

    println();
    val result3 = for (i <- 2 to 10) yield i * 2

    for (i <- result3) {
      println(i);
    }

    for (i <- 1 to 100; if (i % 3 == 0)) {
      if (i % 3 == 0) {
        print(i + "\t");
      }
    }

    println();

    breakable {
      for (i <- 1 to 100; if (i % 3 == 0)) {
        if (i % 3 == 0) {
          print(i + "\t");
          break()
        }
      }
    }
  }
}
