package org.ceek.scala.chapter09

/**
  *
  *
  * @author ceek
  * @create 2020-11-04 15:15
  **/
object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {
    implicit def objectTransform(mysql: Mysql): Operate = {
      new Operate();
    }

    var mysql = new Mysql();
    mysql.delete(); //删除李四
    mysql.insert(); //插入张三
  }
}

class Operate {
  var userName = "张三";

  def insert(): Unit = {
    println("插入数据" + userName);
  }
}

class Mysql {
  var userName = "李四";

  def delete(): Unit = {
    println("删除数据" + userName);
  }
}