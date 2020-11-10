package org.ceek.scala.chapter10

import scala.collection.mutable

/**
  *
  *
  * @author ceek
  * @create 2020-11-06 15:26
  **/
object Scala04_Set {
  def main(args: Array[String]): Unit = {
    //TODO: 默认scala提供的set集合就是不可变的,乱序的
    var set1: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 1);
    println(set1.mkString(","));

    set1.+(12)
    println(set1.+(12).mkString(","));
    println(set1.-(12).mkString(","));

    //TODO:可变集合set
    val mset = mutable.Set(2, 3, 4, 5, 6)
    mset.remove(2)
    println(mset.mkString(","))

    mset.update(3, false) //用于添加和删除元素
    println(mset.mkString("|"))
  }
}
