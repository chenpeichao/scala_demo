/**
  *
  *
  * @author ceek
  * @create 2020-10-10 16:23
  **/
object MethodAndFunction {
  def method1(x: String, y: String): String = {
    //    method1("a", "b");
    return x + y;
    //    return "medhod1方法调用";
  }

  //  var a = method1 _;

  def method2(f: (Int, Int) => Int): Int = {
    f(3, 5);
  }

  var f1 = (a: Int, b: Int) => a + b;

  def main(args: Array[String]): Unit = {
    var inta = 4;
    //    var m1 = method2(f1 )

    printf("%d钱数", 25)

    println(f1(5, 5));
    //    println(method2(1,2));

    println(method1("a", "b"));

    var a: Array[String] = new Array[String](3);

    var b = new Array[Int](5);
    var d = new Array[Char](5);

    var c = Array(5, 6, 7);
    var char1: Char = 'f';
    println(c(1));
  }
}
