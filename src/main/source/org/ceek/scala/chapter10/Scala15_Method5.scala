package org.ceek.scala.chapter10

object Scala15_Method5 {
  def main(args: Array[String]): Unit = {
    /*val list = List(1, List(2,3),4, List(5,6,7))

    val resultList:List[Any] = list.flatMap(x => {
      if(x.isInstanceOf[List[Int]]) {
        x.asInstanceOf[List[Int]]
      } else {
        List(x)
      }
    });

    println(resultList)*/

    val a = (0 to 20).map { case _ => Thread.currentThread().getName }
    val b = ((0 to 20)).par.map { case _ => Thread.currentThread().getName }
    println(a);
    println(b);
  }
}
