package org.ceek.scala.chapter12

/**
  *
  *
  * @author ceek
  * @create 2020-11-18 16:50
  **/
object Scala06_Match5 {
  def main(args: Array[String]): Unit = {
    val list = Array(Currency(12.3, "RMB"), Dollar(123.4), NoAmount);
    for (amount <- list) {
      val result = amount match {
        case Dollar(v) => "$" + v;
        case Currency(x, y) => x + " " + y;
        case NoAmount => "meiyouyong"
      }

      println(amount + ": " + result)
    }
  }
}

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, name: String) extends Amount

case object NoAmount extends Amount