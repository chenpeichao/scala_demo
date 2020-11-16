package org.ceek.scala.chapter10

import scala.io.{BufferedSource, Source}

object Scala10_WordCountFile {
  def main(args: Array[String]): Unit = {
    //读取项目根in目录下的文件并将内容打印
    val source: BufferedSource = Source.fromFile("in/word.txt")
    val list: List[String] = source.getLines().toList
    println(list.mkString(","));
  }
}
