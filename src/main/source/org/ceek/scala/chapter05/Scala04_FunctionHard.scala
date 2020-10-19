package org.ceek.scala.chapter05

/**
  *
  *
  * @author ceek
  * @create 2020-10-19 10:25
  **/
object Scala04_FunctionHard {
  def main(args: Array[String]): Unit = {
    println("打印数据");

    def test(name: String, age: Int = 10): Unit = {
      println(s"名称：${name}，年龄为：${age}");
    }

    test("张三");
    test("张三", 20);

    def test1(age: Int = 20, name: String): Unit = {
      println(s"名称：${name}，年龄为：${age}");
    }

    //TODO: 当包含默认参数值时，并且顺序靠前时，调用时可以指定形参名称指定传递，而忽略形参顺序
    test1(name = "李四")
  }
}
