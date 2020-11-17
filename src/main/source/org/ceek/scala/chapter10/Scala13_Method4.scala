package org.ceek.scala.chapter10

import scala.collection.mutable

object Scala13_Method4 {
  def main(args: Array[String]): Unit = {
    //将两个map进行合并，相同的key进行累加，不同的key直接增加

    var map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3);
    var map2 = mutable.Map("d" -> 5, "e" -> 6, "a" -> 7, "b" -> 7);

    val stringToInt: mutable.Map[String, Int] = map1.foldLeft(map2)((map, tuple1) => {
      map(tuple1._1) = map.getOrElse(tuple1._1, 0) + tuple1._2;
      map
    })

    var list = List(1, 2, 3, 4);
    println(list.fold(100)((x, y) => x));
    println(list.fold(100)((x, y) => y));

    //    println(stringToInt.toList.sortBy(tuple => tuple._2)(Ordering.Int.reverse))
  }
}
