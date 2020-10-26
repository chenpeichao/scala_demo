package org.ceek.scala.chapter060708

/**
  * @author ceek
  * @create 2020-10-22 14:12
  **/
//import用于导入类
//import可在任意的地方使用
//import可以导入一个包中的所有的类，采用下划线代替星号
//import java.util._
//import导入相同包中的多个类，采用大括号进行包含处理
//import java.util.{ArrayList, List}
//import可以采用特殊方式来隐藏指定的类{类名=> _}
//import java.util
//import java.{util => _} //咋不起作用

//scala可以在导入类的时候给类起别名
import _root_.java.util.{ArrayList => JavaArrayList}

object Scala04_import {
  def main(args: Array[String]): Unit = {
    val al = new JavaArrayList[String]();
    al.add("张三")
    al.add("李四")
    println(al)
  }
}
