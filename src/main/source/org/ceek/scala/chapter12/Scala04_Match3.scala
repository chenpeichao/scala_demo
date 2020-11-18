package org.ceek.scala.chapter12

/**
  * 对于集合数据个数进行匹配
  *
  * @author ceek
  * @create 2020-11-18 15:04
  **/
object Scala04_Match3 {
  def main(args: Array[String]): Unit = {
    //数组元素个数级别的匹配
    /*for(arr <- Array(Array(0), Array(0, 1, 2), Array(1, 2), Array(12, 34, 5, 6))) {
      val res = arr match {
        case Array(0) => "0";
        case Array(x, y) => "集合中只有2个参数"; //注意此处x还为具体的数字时，标识的就是具体还有指定整形的集合
        case Array(0, _*) => "以0开头的数组";
        case _ => "以上条件均不符合";
      }
      println(res);
    }*/

    //集合个数级别的匹配
    /*for(arr <- List(List(0), List(0, 1, 2), List(1, 2), List(12, 34, 5, 6))) {
      val res = arr match {
        case 0::Nil => "0";
        case x::y::Nil => "集合中只有2个参数";
        case 0::tail => "以0开头的数组";
        case _ => "以上条件均不符合"
      }

      println(res)
    }*/

    /*//元祖匹配
    for(pair <- Array((0, 1), (2, 2), (9, 0), (1, 2, 3))) {
      val res = pair match {
        case (0, _) => "第一个数为0的元祖"
        case (x, 0) => "第一个数为" + x + "的元祖"
        case (a, b) => (b, a)
        case _ => "未匹配到"
      }

      println(res)
    }*/

    /*//对象匹配
    object Square{
      def unapply(z:Double) = {
        if(z > 7) {
          Some(12); //Some(math.sqrt(z))
        } else {
          None
        }
      }

      def apply(z:Double):Double = z * z;
    }

    //会调用apply方法
    var result = Square(13);
    println(result)

    val param = 12.0;
    param match {
      case Square(n) => println(n); //n的值// apply方法
      case _ => println("未正确匹配");
    }*/
  }
}
