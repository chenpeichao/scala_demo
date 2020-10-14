package org.ceek.scala.chapter03

/**
  *
  *
  * @author ceek
  * @create 2020-10-14 14:21
  **/
object Scala03_ifelse {
  def main(args: Array[String]): Unit = {
    val num = 30;
    val result = if (num > 40) {
      "wojiushiwo";
    }
    println(result);

    val plus = 20;
    val result2 = if (plus < 30) {
      "wohaishiwo";
    }
    println(result2);
  }
}
