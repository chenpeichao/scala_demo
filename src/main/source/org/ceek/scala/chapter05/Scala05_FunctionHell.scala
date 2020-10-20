package org.ceek.scala.chapter05

/**
  *
  *
  * @author ceek
  * @create 2020-10-19 10:49
  **/
object Scala05_FunctionHell {
  def main(args: Array[String]): Unit = {
    /*//TODO scala是完全面向函数式编程
    println("数据打印");

    def f():Unit = {
      println("function");
    }

    def f0():Unit = {
      f _
    }

    println(f0()());*/

    /*def f1(i : Int) = {

      def f2(j: Int, k:Int):Int = {
        j * k * 5;
      }

      //      f2(i, 4)
      f2 _
    }

    //TODO：注意函数体的区别，和函数调用的区别
    println(f1(1)(3,4))
    println(f1(5));*/
    //    val intToInt : () => Int = f1(10)()

    //TODO：函数柯里化
    /*def f3(i:Int)(j:Int,k:Int): Int = {
      i * j * k
    }

    println(f3(1)(2,3));*/

    /*def f1(i : Int) = {

      def f2(j: Int, k:Int):Int = {
        j * k * 5;
      }

      //      f2(i, 4)
      f2 _
    }
    val intToInt:(Int, Int) => Int = f1(2)
    println(intToInt);
    println(f1(2));*/

    /*//将函数作为参数传递给另外一个函数，需要采用特殊的声明方式
    def f4(f : (Int, Int) => Int): Int = {
        f(1, 3) * 10
    }

    def f5(x:Int, y:Int):Int = {
      x*y
    }

    println(f4((x, y) => x * y))*/

    /*def f7(f:(Int, Int) => Int): Int = {
      f(10,10)
    }

    println(f7((x, y) => x * y))*/

    /*def ff1(): Int = {100}
    val ff2 = ff1
    val ff3 = ff1 _

    println(ff2)
    println(ff3)
    println(ff3())*/

    def f7(f: (Int, Int) => Int): Int = {
      f(10, 10)
    }

    println(f7((x: Int, y: Int) => {
      x * y
    }))
    println(f7((x, y) => {
      x * y
    }))
    println(f7(_ * _))
  }
}