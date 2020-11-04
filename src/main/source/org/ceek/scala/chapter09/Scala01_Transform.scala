package org.ceek.scala.chapter09

/**
  *
  *
  * @author ceek
  * @create 2020-11-04 14:10
  **/
object Scala01_Transform {
  def main(args: Array[String]): Unit = {
    implicit def floatToString(param: Double): Int = {
      param.toInt
    }
    val j: Int = 2.3d;
    println(j)

    //隐式转换
    //同一作用域中不能含有多个相同类型的转换规则
    //    implicit def doubleTransform(args:Double): Int = {
    //      args.toInt
    //    }
    val i: Int = 5.9;
    println(i);
  }
}

