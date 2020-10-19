package org.ceek.scala.chapter05

/**
  *
  *
  * @author ceek
  * @create 2020-10-16 16:18
  **/
object Scala03_Function {
  def main(args: Array[String]): Unit = {

    //TODO 如果函数声明时，明确无返回值Unit，那么即使函数体中有return也不起作用
    /*def test() :Unit = {
      return "返回值Unit，return关键字失效";
    }

    println(test _);*/

    //TODO 如果函数体的最后一行进行返回，那么return关键字可以省略
    /*def test():String={
      "无return关键字的返回值"
    }

    println(test);*/

    /*def test(i: Int) {
      return "无return关键字的返回值"
    }

    println(test(1));*/

    /*//如果函数体只有一行代码，可以省略大括号
    def test(i: Int) = "121212"

    println(test(1));*/


    //TODO: 当明确函数没有返回值，那么等号可以省略，省略后，编译器不会将函数体作为函数的返回值
    //如果函数没有形参列表，可以省略小括号，调用时不能添加小括号
    def test() {
      "wojiushiwo"
    }

    println(test())

    //匿名函数
    () -> {
      println("匿名函数")
    }
  }
}
