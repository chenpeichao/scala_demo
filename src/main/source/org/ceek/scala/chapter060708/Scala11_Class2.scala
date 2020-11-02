package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-10-29 16:38
  **/
object Scala11_Class2 {
  def main(args: Array[String]): Unit = {
    var person = new Person("")
    person.userName
  }
}

//类构造方法的参数的作用域默认是整个类的主体，但是想要参数作为属性进行传递，可以采用var或val修饰使用
class Person(var userName: String) {

  //此构造方法中不能定义var userName:String
  def this(userName: String, age: Int) {
    this(userName)
  }
}