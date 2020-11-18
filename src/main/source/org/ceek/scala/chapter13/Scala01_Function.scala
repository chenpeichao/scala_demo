package org.ceek.scala.chapter13

object Scala01_Function {
  def main(args: Array[String]): Unit = {
    /*var list = List(1,2,3,4, "a");
    val listFilter = list.filter(_.isInstanceOf[Int])
    val result = listFilter.map(x => if(x.isInstanceOf[Int])  x.asInstanceOf[Int]+1)
    println(result)*/

    /*//偏函数
    var list = List(1,2,3,4, "a", "b");
    val abc = new PartialFunction[Any, String] {
      //简单理解为对数据进行过滤
      def isDefinedAt(x: Any): Boolean = {
        if (x.isInstanceOf[String]) true else false
      }
      //简单理解为对过滤后的数据进行逻辑运算
      def apply(v1: Any): String = { v1 + "===" }
    }
    //此处不能使用map，因为map必须对所有数据进行转换，不能只对其中一部分数据进行操作
    var result = list.collect(abc)
    println(result) //List(a===, b===)*/

    //使用case模式匹配简化
    var list = List(1, 2, 3, 4, "a", "b");
    val result: List[Int] = list.collect {
      case i: Int => {
        i + 1
      }
    }
    println(result)
  }
}
