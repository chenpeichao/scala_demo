package org.ceek.scala.chapter05

/**
  * 传值调用(t: () => Long)：先计算参数表达式的值，在应用到函数内部
  * 传名调用(t: => Long)：将未计算的参数表达式直接应用到函数内部
  *
  * @author ceek
  * @create 2020-10-20 13:53
  **/
object Scala07_FunctionNameAndValue {
  def main(args: Array[String]): Unit = {
    delayTime({
      println("333"); time
    })
    println("----------------");
    delayTime2({
      println("2222"); time()
    })
  }

  def delayTime(t: () => Long): Unit = {
    println("执行...")
    println(t())
    println("jiesu..")
  }

  def delayTime2(t: => Long): Unit = {
    println("执行开始")
    println(t)
    println("执行结束")
  }

  def time() = {
    println("获取时间内, 单位为 纳秒")
    System.nanoTime()
  }
}
