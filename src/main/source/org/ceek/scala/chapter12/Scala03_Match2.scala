package org.ceek.scala.chapter12

/**
  *
  * 对数据类型进行匹配
  *
  * @author ceek
  * @create 2020-11-18 14:05
  **/
object Scala03_Match2 {
  def main(args: Array[String]): Unit = {
    val a = 8;
    var obj = if (a == 1) 1
    else if (a == 2) 2
    else if (a == 3) BigInt(3)
    else if (a == 4) Map("aa" -> 1.3444f, "f" -> 2.3444f)
    else if (a == 5) Map(1 -> "bbbb")
    else if (a == 6) Array(1, 2, 3, "")
    else if (a == 7) Array(1, 2, 3)
    else if (a == 8) Array("aa")

    obj match {
      case obj: Int => println("数据为Int");
      case obj: BigInt => println("数据为BigInt");
      case obj: Array[String] => println("数据为Array(String)"); //源码中为ifelse( instanceof String[])
      case obj: Array[Any] => println("数据为Array[Any]"); //源码中为ifelse( instanceof Object[])
      case obj: Array[Int] => println("数据为Array[Int]"); //源码中为ifelse( instanceof int[])
      case de: Map[String, Int] => println("数据为Map[String, Int]"); //源码中为ifelse( instanceof Map)
      case abc: Map[Int, String] => println("数据为Map[Int, String]"); //源码中和上一步相同，忽略
      case _ => println("数据类型未知！");
    }
  }
}
