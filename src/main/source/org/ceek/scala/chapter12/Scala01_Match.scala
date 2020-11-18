package org.ceek.scala.chapter12

/**
  *
  *
  * @author ceek
  * @create 2020-11-18 11:31
  **/
object Scala01_Match {
  def main(args: Array[String]): Unit = {
    //下划线
    //模式匹配、系统给变量赋初始值，类似于java导包的型号，给类起别名，隐藏类
    //代替方法的参数，可以让函数不执行

    /*val list = List("hello spark", "hello scala");
    val wordList: List[String] = list.flatMap(_.split(" "))
    println(wordList);*/

    val oper = "#";
    val n1 = 10;
    val n2 = 3;
    var res = 0;

    oper match {
      case _ => res = n1 % n2;
      case "+" => res = n1 + n2;
      case "-" => res = n1 - n2;
    }

    println(res);
  }
}
