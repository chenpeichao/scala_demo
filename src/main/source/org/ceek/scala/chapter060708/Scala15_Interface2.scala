package org.ceek.scala.chapter060708

;

/**
  * scala中的特质trait
  *
  * @author ceek
  * @create 2020-11-02 14:43
  **/
object Scala15_Interface2 {
  def main(args: Array[String]): Unit = {
    var user15 = new User15();
  }
}

//特质和父类没有关系，只和当前混入的类有关，在调用时，父类先执行，然后执行特质，最后执行当前类
//如果父类混入了相同的特质，那么特质的代码指挥执行一遍
trait TestTrait15_1 {
  println("trait1 code...");
}

trait TestTrait15_2 {
  println("trait2 code...");
}

//当父类也实现相同特质时，会先执行特质(父类的父类)，然后执行父类，在执行当前类
class Person15 {
  println("parent code....");
}

class User15 extends Person15 with TestTrait15_1 with TestTrait15_2 {
  println("child code");
}