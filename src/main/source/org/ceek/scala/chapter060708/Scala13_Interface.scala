package org.ceek.scala.chapter060708

/**
  *
  *
  * @author ceek
  * @create 2020-11-02 11:44
  **/
class Scala13_Interface {

}

trait TestTrait13 {

}

trait TestTrait133 {

}

class Person13 {}

//特质可以继承，所以使用extends关键字
//如果类继承多个特质，采用with连接
//如果类同时存在父类和特质，依然采用继承方式，但是继承的是父类，连接特质
class User13 extends Person13 with TestTrait13 with TestTrait133 {

}
