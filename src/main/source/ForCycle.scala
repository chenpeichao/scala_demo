/**
  *
  *
  * @author ceek
  * @create 2020-10-10 15:45
  **/
object ForCycle {
  //  def main(args: Array[String]): Unit= {
  //    val a:Int = 0;
  //    var b:Short = 10;
  //    //会进行笛卡尔积
  //    //to包含尾数；until不包含尾数
  //    for(a <- 1 to 10; b <- 1 until 10 if a > 6; if b > 8) {
  //      println("a=" + a);
  //      println("b=" + b);
  //    }
  //  }


  def main(args: Array[String]): Unit = {
    //    var list  = Array(1,2,3,4,5,6,7,8,9,10);
    //    var cycle = for {a <- 1 to 10 if a != 2
    //    } yield a;
    //
    //    var index: Int = 0;
    //    //此处不能直接将cycle替换为list变量？
    //    for(p <- cycle) {
    //      println(p);
    //    }

    var intD = Array.ofDim[Int](3, 4);
    //    var intD:Array[Array[Int]] = Array.ofDim(3,4);

    println(intD.length)
    for (i <- 0 to intD.length - 1) {
      var intDD = intD(i)
      println(intDD.length)
    }

    var listNum = List.tabulate(4, 5)(_ * _)
    print(listNum)
  }
}
