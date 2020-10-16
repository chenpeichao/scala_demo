package org.ceek.scala.chapter04

/**
  * 打印杨辉三角
  *
  * @author ceek
  * @create 2020-10-16 13:58
  **/
object Scala01_yanghui {
  def main(args: Array[String]): Unit = {
    for (i <- Range(1, 25, 2)) {
      print(" " * ((25 - i) / 2))
      println("*" * i);
    }
  }
}
