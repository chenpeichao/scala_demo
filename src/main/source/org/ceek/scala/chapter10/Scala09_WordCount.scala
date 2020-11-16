package org.ceek.scala.chapter10

import scala.collection.mutable.ArrayOps

object Scala09_WordCount {
  def main(args: Array[String]): Unit = {
    /*var list = List(("hello world", 4), ("hello hadoop", 2), ("hello habse", 3));
    val tuples: List[(String, Int)] = list.flatMap(tuple => {
      val keys: ArrayOps.ofRef[String] = tuple._1.split(" ");
      keys.map(x => (x, tuple._2))
    })

    val value: Any = tuples.groupBy(tuple1 => tuple1._1).map(tuple2 => {
      (tuple2._1, tuple2._2.map(tuple3 => tuple3._2).sum)
    }).toList.sortBy(tuple4 => tuple4._2)(Ordering.Int.reverse).take(2)

    println(value);*/

    var list = List(1, List(2, 3), 4, List(5, 6))
    val result = list.flatMap(x => {
      if (x.isInstanceOf[Int]) {
        List(x)
      } else {
        x.asInstanceOf[List[Int]]
      }
    })
    println(result)
  }
}
