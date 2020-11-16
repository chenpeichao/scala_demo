package org.ceek.scala.chapter10

import scala.collection.mutable.ArrayOps

/**
  *
  *
  * @author ceek
  * @create 2020-11-16 9:19
  **/
object Scala10_WordCount {
  def main(args: Array[String]): Unit = {
    var lineList = List(("Hello hadoop", 4), ("Hello hbase", 3), ("Hello scala", 2));
    //1、将一行一行的数据拆分成一个一个的单词---采用flatMap进行
    //("Hello hadoop", 4)
    // => ("Hello", 4) ("hadoop", 4)
    val baseTupleMap: List[(String, Int)] = lineList.flatMap(tuple => {
      val split: ArrayOps.ofRef[String] = tuple._1.split(" ");
      split.map(keyword => (keyword, tuple._2))
    })
    //2、进行分组，将相同key的tuple组合在一起
    //Hello -> List(("Hello", 4),("Hello", 3),("Hello", 2))
    val groupByValues: Map[String, List[(String, Int)]] = baseTupleMap.groupBy(keyValue => keyValue._1)

    //3、将分组后的数据进行结构转换，对于其中的key和values的和进行组装
    //(Hello, 4+3+2)
    //    val tuple1ToTuple1 = groupByValues.map(tuple => {
    //      (tuple._1, tuple._2.map(x => x._2).sum)
    //    })
    //mapValues方法可以只针对Map集合中的value做操作，key保持不变----与上面代码等效
    val tuple1ToTuple1: Map[String, Int] = groupByValues.mapValues(valueList => valueList.map(tuple => tuple._2).sum)

    //4、将map转化为list并进行排序，取前n个
    val resultList: List[(String, Int)] = tuple1ToTuple1.toList.sortWith((left, right) => left._2 > right._2).take(3)
    println(tuple1ToTuple1);
    println(resultList);
  }
}
