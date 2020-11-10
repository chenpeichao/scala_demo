package org.ceek.scala.chapter10

/**
  * scala元祖
  *
  * @author ceek
  * @create 2020-11-10 10:33
  **/
object Scala06_Tuple {
  def main(args: Array[String]): Unit = {
    //Tuple：元祖->将无关的数据当成一个整体来使用
    val tuple = Tuple4("张三", 2.0f, 1, true);

    //访问元祖中的数据，请用相应的顺序编号，_顺序编号
    println(tuple._3)

    //循环遍历
    for (item <- tuple.productIterator) {
      println(item)
    }
  }
}