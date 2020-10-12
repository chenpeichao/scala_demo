
/**
  * @author ceek
  * @create 2020-10-10 11:27
  **/
class Outer {

  //当private添加到方法上时，不能在外部调用
  private class Inner {
    var a: String = "121212ababab";

    def getResult(): String = {
      return "abc";
    }
  }

  def getAbc(): Unit = {
    return new Inner().getResult();
  }
}

object Outer {
  def main(args: Array[String]): Unit = {
    println(new Outer().getAbc());
  }
}