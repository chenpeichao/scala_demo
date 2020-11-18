package org.ceek.scala.chapter12

/**
  *
  *
  * @author ceek
  * @create 2020-11-18 16:44
  **/
object Scala05_Match4 {
  def main(args: Array[String]): Unit = {
    val (x, y) = (1, 2)
    val (username, age, email) = ("张三", 30, "xxx@163.com")
    println(x)
    println(username)

    val list = List(("a", 1), ("b", 2))
    for (tuple <- list) {
      println(tuple._1 + "=>" + tuple._2);
    }
  }
}
