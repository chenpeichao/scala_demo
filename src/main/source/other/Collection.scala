import scala.collection.mutable

//import scala.collection.mutable.Set;
//import scala.collection.immutable.HashSet
//import scala.collection.mutable.ListBuffer
/**
  * 对不可变Set和List操作，会产生一个新的Set或List，原始的集合不会发生变化
  * 对可变集合mutable.ListBuffer和mutable.Set添加元素后，改变的是本身的集合
  *
  * @author ceek
  * @create 2020-10-12 13:54
  **/
object Collection {
  def main(args: Array[String]): Unit = {

    println("-------------------------------List----------------------------------------------")
    //-------------------------------list----------------------------------------------
    //注意区分list和mutable.listBuffer的区别
    var listTmp = List(1, 2, 3);

    println(listTmp)

    listTmp = listTmp.+:(12);
    println(listTmp)

    //list集合添加元素
    listTmp = 2 +: listTmp
    //    listTmp = 2 :: listTmp ;
    //list集合添加集合
    //    listTmp = listTmp ::: listTmp
    var str = new StringBuilder()
    listTmp.addString(str, "=")

    println(listTmp)

    var sum: Int = 0;

    listTmp.foreach(x => sum += x)

    println(listTmp)
    println(str)
    println(sum)

    println(listTmp.tail)

    println("-------------------------------Set----------------------------------------------")
    //-------------------------------Set----------------------------------------------
    //注意区分set和mutable.set的区别
    var setTmp = mutable.Set(1, 2, 3);
    setTmp.add(4)
    //    setTmp.+(4)
    setTmp = setTmp.+(5)
    println(setTmp)

    println(setTmp.max)
    print(setTmp.size)

    println("-------------------------------Map----------------------------------------------")
    //-------------------------------Map----------------------------------------------
    var mapTmp = Map("a" -> 2, "b" -> 3, "c" -> 4);
    println(mapTmp.keys)
    println(mapTmp.size)

    var mapTmp2: mutable.Map[String, Int] = mutable.Map("c" -> 4);
    println(mapTmp2.size)

    mapTmp += ("c" -> 5)
    mapTmp2 += ("c" -> 5)
    println(mapTmp)
    println(mapTmp2)
    println(mapTmp2.isEmpty)

  }
}