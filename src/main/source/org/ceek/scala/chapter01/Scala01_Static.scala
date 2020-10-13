package org.ceek.scala.chapter01

/**
  *
  *
  * @author ceek
  * @create 2020-10-13 10:54
  **/
object Scala01_Static {
  private val abc: String = "wojiushiwo";
  private var abcd: String = "wohaishiwo";

  def main(args: Array[String]): Unit = {
    val name = "wohaishiwo";
    val age = 1;
    println("wojiushiwo");
    println(s"名字叫${name}%s\t,哈哈");
    println(f"年龄${age}%.3f,哈哈");
    println(raw"名字叫${name}%s\n,哈哈");
  }
}
