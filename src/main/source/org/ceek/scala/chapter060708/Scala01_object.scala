package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-10-20 15:59
  **/
object Scala01_object {
  def main(args: Array[String]): Unit = {
    val user = new User();

    user.username = "zhangsan";

    println(user.username);
  }
}

//声明类
class User {
  //类的主体内容 ==>类体

  //声明属性
  var username: String = null;

  var age: Int = 0;
  var score: Char = 0;
  var schema: Byte = 0;

  def log(): Boolean = {
    true
  }
}