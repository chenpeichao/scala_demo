package org.ceek.scala.chapter14

object Scala02_Class2 {
  def main(args: Array[String]): Unit = {
    //默认情况下，scala中的泛型和java一样，不变
    //在scala中，为了丰富泛型的功能，提供了协变(泛型可定义子类，增加功能)(+)，逆变(-)
    val test: Test[User_02] = new Test[Person_02]
    println(test);
  }
}

class Person_02 {}

class User_02 extends Person_02 {}

class Child_02 extends User_02 {}

//-表示逆变
//+表示协变
class Test[-User_02] {}