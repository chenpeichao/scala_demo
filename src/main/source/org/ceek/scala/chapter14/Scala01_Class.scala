package org.ceek.scala.chapter14

object Scala01_Class {
  def main(args: Array[String]): Unit = {
    println(test(new User()))
  }

  //>:标识泛型的下限；但是和java好像有区别，传递什么都可以
  //<:标识泛型上限：所以传递数据是，应该为子类或当前类
  def test[T <: User](t: T) = {
    println(t);
  }
}

class Person {}

class User extends Person {}

class Child extends User {}

class Animal {}