package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-11-02 16:46
  **/
object Scala17_Interface4 {
  def main(args: Array[String]): Unit = {
    //    var mysql = new Mysql();

    //动态混入
    var mysql = new Mysql17() with Operate17;
    mysql.insert();
  }
}

trait Operate17 {
  def insert(): Unit = {
    println("插入数据...");
  }
}

class Mysql17 {

}