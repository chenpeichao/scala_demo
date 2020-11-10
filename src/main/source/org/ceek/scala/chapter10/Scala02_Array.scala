package org.ceek.scala.chapter10

import scala.collection.mutable._

/**
  *
  *
  * @author ceek
  * @create 2020-11-04 16:10
  **/
object Scala02_Array {
  def main(args: Array[String]): Unit = {
    var array: Array[Int] = Array.apply(1, 2, 3, 4, 5);
    //此方法不通过new来构造对象是因其调用了Array的apply方法
    var array1: Array[Int] = Array(1, 2, 3, 4, 5);
    var array2: Array[Int] = new Array[Int](3);

    //    array.+("wo");

    /*var arrtmp = array:+(1);//arrtmp的值为：array, 1

    println(arrtmp.mkString(","))
    println(array == arrtmp);

    println(array.mkString(","))*/
    /*println(array(1));
    println(array.length);

    var arrtmp = array:+1;
    println(array.mkString(","));
    println(array == arrtmp);
    println(arrtmp.mkString(","));

    for(x <- array) {
      println(x);
    }*/

    //    var s = array.+("xxxx");

    /*def foreachPrint(arg:Int):Unit = {
      println(arg);
    }
    array.foreach(foreachPrint(_))
    array.foreach(foreachPrint)*/

    /*array.foreach((i:Int) => {print(i)})
    array.foreach((i) => {print(i)})
    array.foreach({print(_)})
    array.foreach(print(_))
    array.foreach(println)*/
    //    array.foreach((_) => {print(_)})  //错误，不能这样写，无法输出数据

    //1.1、增加元素：
    /*array:+=(1);
    var ints: Array[Int] = array :+ 1
    ints = 1 +: ints
    println(ints.mkString(","));*/

    //1.2、修改元素
    /*array(1) = 9;
    println(array.mkString(","))*/
    /*array.update(0,3);
    array.update(1,3);
    println(array.mkString("|"));
    array.drop(3)   //表示删除多少个元素
    val drop: Array[Int] = array.dropRight(2)
    println(array.mkString(","))
    println(drop.mkString("="))*/


    //TODO: 2：可变数组
    var arraybuffer = ArrayBuffer(2, 3, 4, 5, 6, 7, 8, 9);

    //2.0：增加
    arraybuffer += (1)
    arraybuffer :+ 1
    arraybuffer :+ array

    //2.1：查询
    //    println(arraybuffer(1));
    //2.2：插入
    arraybuffer.insert(2, 10);
    println(arraybuffer.mkString(","));
    //2.3：删除(删除的是第n个索引的值)
    arraybuffer.remove(2);
    println(arraybuffer.mkString(","))
    arraybuffer.remove(1, 4)
    println(arraybuffer.mkString(","))

    //3：可变数组和不可变数组的转换
    val mutableArray: Buffer[Int] = array.toBuffer
    arraybuffer.toArray
  }
}
