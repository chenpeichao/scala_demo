package org.ceek.scala.chapter10

/**
  *
  *
  * @author ceek
  * @create 2020-11-16 9:48
  **/
object Scala11_Method2 {
  def main(args: Array[String]): Unit = {
    /*var list = List(1, 2, 3, 4)
    list.reduce(_-_)

    //reduce方法：化简，数据减少
    //将集合的数据经过逻辑处理后只保留一个结果
    val reducePlus: String = list.reduce((x, y) => y)
    val reduceLeft: Int = list.reduceLeft(_ - _)

    val reduceRight: Int = list.reduceRight(_ - _)

    //reduce和reduceLeft的执行顺序一致，均为从左到右
    //reduceRight：标识从右到左进行执行
    println(reducePlus);//reduce=reduceLeft
    println(reduceLeft);
    println(reduceRight); //(1-(2-3))*/

    var listStr = List("a", "b", "c")
    val reduceStr: String = listStr.reduce((x, y) => y)
    println(reduceStr)
  }
}
