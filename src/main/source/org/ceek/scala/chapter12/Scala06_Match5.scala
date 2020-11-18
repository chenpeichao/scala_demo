package org.ceek.scala.chapter12

/**
  *
  *
  * @author ceek
  * @create 2020-11-18 16:50
  **/
object Scala06_Match5 {
  def main(args: Array[String]): Unit = {
    val list = Array(Currency(12.3, "ceek"), Dollar(123.4), NoAmount);
    for (amount <- list) {
      amount match {
        case _ => println("未查询到匹配类型");
      }
    }
  }
}

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, name: String) extends Amount

case object NoAmount extends Amount