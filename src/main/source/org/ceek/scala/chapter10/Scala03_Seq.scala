package org.ceek.scala.chapter10

import scala.collection.immutable.Queue
import scala.collection.mutable.ListBuffer
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._

/**
  *
  *
  * @author ceek
  * @create 2020-11-06 10:49
  **/
object Scala03_Seq {
  def main(args: Array[String]): Unit = {
    //默认scala提供的集合都是不可变的
    var list = List(1, 2, 4, 3);
    var list1 = List(5, 6, 7, 8);

    //根据索引获取数据
    //    println(list(2))

    list :+= 1;
    //    println(list.mkString(","));

    //TODO: 1、不可变seq
    //1.1、数据定义
    /*val list2: List[Int] = list++(list1)
//    println(list2.mkString(","));
    val list3 =  1000 :: list
    val listHH =  list.::(1000)
    println("list3=>" + list3.mkString("="));
    val list4 = list.:::(list2)
    println(list4.mkString(","));
//    val list5 =  list.::(1)
    val list5 =  list.:::(list)
    List.concat(list, list1)
    println(list5.mkString("|"))

    var list6 = Nil.::(1).::(12112).:::(list2)
    println(list6.mkString("|"));*/

    /*//1.2、修改
    var list7 = 1::2::3::4::5::Nil;

    var list8:List[Int] = list7.updated(0,10);
    println(list7.mkString("|"))
    println(list8.mkString("|"))

    //1.3、删除
    var list9 = list7.drop(2);
    println(list9.mkString("="))*/

    //TODO: 2、可变集合
    var mList = ListBuffer(1, 2, 3, 4, 5);
    var mList1 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil;

    /*println(mList.mkString(","));
    println(mList1.mkString(","));

    mList.insert(2,10);   //第一个参数标识索引
    mList.update(3,100);  //参数表示索引
    mList.remove(2)     //参数表示索引
    println(mList.mkString("="));*/

    //集合属性
    /*println(mList.head)   //第一个
    println(mList.last)   //最后一个
    println(mList.tail)   //除了第一个元素的集合
    println(mList.init)   //除了最后一个元素的集合*/

    //TODO: 队列(一定可变)
    //当为可变队列时打印：1,2,3,4,121212           2|3|4|121212
    //当为不可变队列时打印：1,2,3,4                1|2|3|4
    var queue = Queue(1, 2, 3, 4);
    queue.enqueue(121212) //当为可变队列时，会添加到队列中
    println(queue.mkString(","));

    queue.dequeue
    println(queue.mkString("|"));
  }
}
