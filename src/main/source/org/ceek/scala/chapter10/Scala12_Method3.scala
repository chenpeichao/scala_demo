package org.ceek.scala.chapter10

/**
  *
  *
  * @author ceek
  * @create 2020-11-16 10:15
  **/
object Scala12_Method3 {
  def main(args: Array[String]): Unit = {
    /*val list = List(1,2,3)
    val foldSum = list.fold(15)(_+_)
    val foldRightSub = list.foldRight(100)(_-_);

    println(foldSum)
    println(foldRightSub) //1-(2-(3-(4-100)))*/

    /*val strList = List("f", "a", "c", "b");

    //折叠，也可以对集合数据进行简化，获取最终的一条结果
    //fold方法可以传递2个部分的参数，
    // 第一个部分表示集合之外的数据，第二部分的参数标识数据进行的逻辑处理

    //    var foldValue = list.fold("x")((x, y) => x + y);
    //    println(foldValue)
    val right:String = strList.foldRight("p")((param, item) => item)  //返回p
    val right2:String = strList.foldRight("p")((param, item) => param)  //返回f

    println(right)*/

    //TODO scan 会将第一个参数保留输出
    val list = List(1, 2, 5)
    val scan: List[Int] = list.scan(10)(_ - _)
    val scanLeft: List[Int] = list.scanLeft(10)(_ - _)
    val scanRight: List[Int] = list.scanRight(10)(_ - _) //1 - (2 - (5-10))
    println(scan)
    println(scanLeft)
    println(scanRight)
  }
}
