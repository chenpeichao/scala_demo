package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-11-02 16:16
  **/
object Scala16_Interface3 {
  def main(args: Array[String]): Unit = {
    var mysql = new Mysql();
    mysql.insert();
  }
}

trait Operate {
  println("Operate trait...");

  def insert(): Unit = {
    println("插入数据...");
  }
}

trait DB extends Operate {
  println("DB...");

  override def insert() {
    println("向数据库");
    //    super.insert();
  }
}

trait File extends Operate {
  println("FIle...");

  override def insert(): Unit = {
    println("向文件");
    //    super.insert();
  }
}

//多特质混入时，代码执行顺序为从左到右，如果特质中有父特质，会优先执行
//多特质混入时，方法调用的顺序为从右到左(当不调用super.相同方法()，只执行子类)
//特质中super关键字不是指代父特质，指代的是上一级特质，如果需要指向父特质，需增加配置super[特质]
//java的接口可以在scala中当成特质来用
class Mysql extends DB with File with Serializable {
  println("Mysql...");

  override def insert(): Unit = {
    println("向mysql");
    //    super[Operate].insert();//指定父特质执行
    //    super.insert();
  }
}