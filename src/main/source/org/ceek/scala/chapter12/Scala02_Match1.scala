package org.ceek.scala.chapter12

/**
  *
  *
  * @author ceek
  * @create 2020-11-18 11:37
  **/
object Scala02_Match1 {
  def main(args: Array[String]): Unit = {
    //scala中的匹配，会从上到下匹配，匹配到第一个后就结束
    /*for(item <- "1234+-") {
      print(item == '1');
      item match {
        case '1' => println("输入的是非整数2")
        case '2' => println("输入的是非整数")
      }
    }*/

    //当没有匹配上case时，会报MatchError错误
    var item = 'd'
    item match {
      case '1' => println("输入的是非整数2")
      case _ if (item == 'c') => println("输出默认值");
      //      case charTmp => println("输入的是非整数" + charTmp)
    }
  }
}
