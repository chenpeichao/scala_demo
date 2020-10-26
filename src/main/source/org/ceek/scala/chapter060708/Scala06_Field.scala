package org.ceek.scala.chapter060708

/**
  * Scala中也有四种访问权限:public; protected; default(package); private
  * public：默认访问权限
  * protected：访问权限相对java，同包不能访问(java可以)，子类可以访问
  * private：私有访问权限，只能当前类访问
  *
  * @author ceek
  * @create 2020-10-23 13:52
  **/
package p1 {

  package object p2 {
    val userHH = ""

    class UserP2 {
      var username = "zhangsan"
      protected val age = 10
      private val address = "朝阳区"
      private[p2] val email = "cpc@163.com"
    }

    class UserP22 {
      //其它两个变量掉用不了
      println(new UserP2().username)
      println(new UserP2().email)
      val userP2 = new UserP2();
    }

  }

  package p3 {

    class UserP3 extends p2.UserP2 {
      val userp2 = new p2.UserP2();
      //      var userAge = userp2.age
      var userName = userp2.username
    }

  }

}

package p4_out {

  class Userp4_out {
    val userp2 = new p1.p2.UserP2();
    userp2.username
  }

}


class User06 {
  val username: String = "张三"

  def main(args: Array[String]): Unit = {
    var password: String = "**1212"
    val age: Int = 10;
  }
}