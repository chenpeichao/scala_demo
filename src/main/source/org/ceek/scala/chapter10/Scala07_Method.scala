package org.ceek.scala.chapter10

object Scala07_Method {
  def main(args: Array[String]): Unit = {
    var list = List(1, 2, 4, 6, 3, 4);

    /*//TODO 求和
    println(list.sum);
    //TODO 输出最大值
    println(list.max);
    //TODO 输出最小值
    println(list.min);
    //TODO 输出乘机
    println(list.product)
    //TODO 反转(不改变顺序)
    println(list.reverse)*/

    //TODO 分组(通过指定函数的返回值进行分组)
    //    val intToInts: Map[Int, List[Int]] = list.groupBy(x => x)
    //    intToInts.foreach(tuple => println(tuple._1 + "=" + tuple._2))

    /* val intToInts = list.groupBy(x => x % 2)
     println(intToInts);*/
    /*val stringList = List("11", "12", "21", "13");
    val stringToStrings: Map[String, List[String]] = stringList.groupBy(x => x.substring(1))
    stringToStrings.toList.foreach(tuple => println(tuple._1 + "=" + tuple._2))*/

    //TODO 排序sortBy
    /*val ints = list.sortBy(x => x)
    println(ints.mkString(","));

    var tuplet = List((1,3), (1,2), (2,3));
    var x = tuplet.sortBy(x => (x._1, x._2))
    //多字段，多排序
    var xReverse = tuplet.sortBy(x => (x._1, x._2))(Ordering.Tuple2(Ordering.Int, Ordering.Int.reverse))
    x.foreach(x => println(x))
    xReverse.foreach(x => println(x))*/

    //TODO 排序 sortWith
    /*//降序-比sortBy简单
    val ints: List[Int] = list.sortWith((x, y) => x > y)
    println(ints);*/

    //TODO 获取前N个数据
    /*val ints: List[Int] = list.take(3)
    println(ints)*/

    //TODO 迭代
    //    println(list.iterator.mkString(","))

    //TODO 映射
    /*val intToInt: Map[Int, Int] = list.groupBy(tuple => tuple).map(intToInts => (intToInts._1, intToInts._2.size))
    val tuples: List[(Int, Int)] = intToInt.toList.sortWith((x, y) => {
      if (x._2 == y._2) {
        x._1 < y._1
      } else {
        x._2 > y._2
      }
    })
    println(tuples.take(3));*/

    //TODO 扁平化操作
    //将一个整体中的内容拆成一个一个的个体
    var lineList = List("hello hadoop", "hello java", "hello scala");
    val strings: List[String] = lineList.flatMap(x => x.split(" "))
    println(strings);

    /*var lineList = List(("hello hadoop", 1), ("hello java", 2), ("hello scala", 3), ("hello hbase", 2));
    val strings: List[(String, Int)] = lineList.flatMap(tuple => {
      val strings = tuple._1.split(" ")
      strings.map(x => (x, tuple._2))
    })
    val tuples: List[(String, Int)] = strings.groupBy(x => x._1).map(tuple => {
      val sum = tuple._2.map(tuple => tuple._2).sum
      (tuple._1, sum);
    }).toList.sortWith((tupleLeft, tupleRight) => {
      tupleLeft._2 > tupleRight._2
    })
    println(tuples);*/

    /*list.sortWith()
    list.sortBy()
    list.groupBy()
    list.map()
    list.filter()
    list.iterator*/

  }
}
