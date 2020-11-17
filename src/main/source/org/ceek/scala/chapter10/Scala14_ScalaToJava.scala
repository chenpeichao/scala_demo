package org.ceek.scala.chapter10

import scala.collection.mutable.ArrayBuffer

/**
  * scala的集合和java集合相互转化
  */
object Scala14_ScalaToJava {
  def main(args: Array[String]): Unit = {
    var arr = ArrayBuffer("12", "23", "4");

    /** scala集合转java集合 */
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)

    val arrList = javaArr.command()
    println(arrList);

    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable

    val scalaArr: mutable.Buffer[String] = arrList

    scalaArr.append("jack")
    println(scalaArr);
  }
}
