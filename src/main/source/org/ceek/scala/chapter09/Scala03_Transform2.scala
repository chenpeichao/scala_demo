package org.ceek.scala.chapter09

/**
  * 隐式值
  *
  * @author ceek
  * @create 2020-11-04 15:31
  **/
object Scala03_Transform2 {
  def main(args: Array[String]): Unit = {
    //同类型的隐式值只能定义一个
    implicit val name = "王五";
    implicit val name1212 = 1;

    def test1(implicit name: String = "李四"): Unit = {
      println("hello:" + name);
    }

    def test2(name: String): Unit = {
      println("hello:" + name);
    }

    test1("张三") //打印优先级，张三>李四>王五
  }
}