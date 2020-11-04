package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-11-04 10:39
  **/
object Scala18_ClassInfo {
  def main(args: Array[String]): Unit = {
    //    println(classOf[User18]);

    val user18: Class[User18] = classOf[User18]
    val interfaces: Array[Class[_]] = user18.getInterfaces
    //    val superclass: Class[_ >: User18] = user18.getSuperclass

    //    println(interfaces.foreach(x => println(x)));

    //可以使用type关键字给类起别名
    //    type XXX = User18;
    //    var test = new XXX();

    var user = new User18();

    println(user.isInstanceOf[User18]);
    if (user.isInstanceOf[User18]) {
      var user1 = user.asInstanceOf[User18];
      user = user.asInstanceOf[User18]
      println(user == user1);
      user.userName = "李四";
      println(user.equals(user1));
      println(user.userName);
      println(user1.userName);
    }
  }
}

trait Person18 {
  println("我就是我");
}

class User18 extends Person18 {
  var userName = "张三";
}

object User18 {
  var age = 18;
}