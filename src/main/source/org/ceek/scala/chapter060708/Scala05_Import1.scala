package org.ceek.scala.chapter060708

/**
  * @author ceek
  * @create 2020-10-22 14:30
  **/
//scala中如果想从最开始的包中查找类，需要增加绝对路径，使用_root_开头
import _root_.java.util._

package java {
  package util {

    class HashMap {
      var username = "张三";
    }

    object Scala05_Import1 {
      def main(args: Array[String]): Unit = {
        val map = new _root_.java.util.HashMap[String, String]();
        map.put("key", "value")
        println(map)
      }
    }

  }

}
