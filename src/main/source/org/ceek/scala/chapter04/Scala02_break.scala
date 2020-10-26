package org.ceek.scala.chapter04

import scala.util.control.Breaks._

//import scala.util.control.Breaks

/**
  *
  *
  * @author ceek
  * @create 2020-10-16 14:08
  **/
object Scala02_break {
  def main(args: Array[String]): Unit = {
    //TODO java循环中没有continue和break关键字，因其不符合面向对象的概念
    //continue通过ifelse来实现
    //break专门有实现定义

    //continue打印奇数
    for (i <- 1 until 20) {
      if (i % 2 != 0) {
        print(i + "\t")
      }
    }
    println()


    //    for (i <- 50 to 60) {
    //      if (i >= 55) {
    //        Breaks.break();
    //      }
    //    }

    val pass = 3
    //break关键字实现
    breakable {
      for (i <- 1 to 10) {
        if (i == pass) {
          break()
        }
        print(i + "\t");
      }
    }
    println()
    //
    //    //break关键字实现，通过Breaks.breakable，"方法执行完成！会打印"
    //    Breaks.breakable {
    //      for(i <- 1 to 10) {
    //        if(i == pass) {
    //          Breaks.break()
    //        }
    //        print(i + "\t");
    //      }
    //    }
    //    println("方法执行完成！");
  }
}
