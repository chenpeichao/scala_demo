package org.ceek.scala.chapter10

object Scala08_Method1 {
  def main(args: Array[String]): Unit = {
    //TODO 拉练：zip
    var list1 = List(1, 2, 3, 11, 12);
    var list2 = List(5, 6, 7, 11);

    val tuples: List[(Int, Int)] = list1.zipAll(list2, 8, 9)
    println(tuples.mkString(","));

    //交集
    println(list1.union(list2))
    println(list1.union(list2).toSet)

    //并集
    println(list1.intersect(list2))

    //差集
    println(list1.diff(list2));
    println(list2.diff(list1));
  }
}
