package org.ceek.scala.chapter10

import scala.collection.mutable._

/**
  *
  *
  * @author ceek
  * @create 2020-11-06 15:39
  **/
object Scala05_Map {
  def main(args: Array[String]): Unit = {
    //Scala中k-v对数据采用特殊的方式声明
    //默认Map集合不可变
    val map: Map[String, String] = Map("a" -> "张三", "no2" -> "李四", "no3" -> "王五")
    map.put("赵六", "no4")
    //
    println(map.mkString("|"));
    //
    //    val map1:Map[String, String] = map.+("no4"-> "赵六")
    //    println(map1.mkString(","));
    //
    //    val map2:Map[String, String] = map.+("a"->"钱七")
    //    println(map2.mkString(","));
    //    //删除key
    //    val map3:Map[String, String] = map.-("a")
    //    println(map3.mkString(","));
    //    println(map3 == map);
    //
    //    var map4 = map.updated("a","b")
    //    println(map.mkString(","))
    //    println(map4.mkString(","))

    //scala为了防止集合出现空指针问题，提供了一个特殊的类，Option，有两个特殊的对象，Some和None
    //如果确实没有获取到数据，为了不出现异常，Option类提供了有默认值的方法
    //    map.get("").get
    //  TODO: 可变Map集合
    var imap = Map("" -> 1);
    imap.put("zhangsan", 2)
    imap ++= imap
    println(imap.mkString(","))
  }
}
