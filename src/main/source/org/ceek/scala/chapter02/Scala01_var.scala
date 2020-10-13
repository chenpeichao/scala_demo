package org.ceek.scala.chapter02

/**
  * @author ceek
  * @create 2020-10-13 15:12
  **/
object Scala01_var {
  def main(args: Array[String]): Unit = {
    var dog = new Dog();
    println(dog.name)
    println(Dog.name);

    dog = new Dog();

    //    var c1:Char = 'a' + 1;
    //    println(c1)
    var s1: String = null;
    println(s1);
    getResult();
  }

  def getResult(): Nothing = {
    throw new Exception("wojiushiwo");
  }
}

class Dog {
  val name = "Dog";
}

object Dog {
  val name = "dog";

  def method(): Unit = {
    Dog.name
  }
}