package org.ceek.scala.chapter03

import scala.io.StdIn

/**
  *
  * 控制台输入数据获取
  *
  * @author ceek
  * @create 2020-10-14 9:19
  **/
object Scala01_In {
  def main(args: Array[String]): Unit = {
    val name = "名称";
    println(s"基本输出${name}");

    val readInStr = StdIn.readLine();

    println(s"获取到键盘输入为：$readInStr");
  }
}
