package libin.program._02_scala.implicitDemo

import libin.program._02_scala.implicitDemo.ImplicitBase.MyPerson


/**
  * Copyright (c) 2018/9/9. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 
  */
object Implicitimpl {
  def main(args: Array[String]): Unit = {

    val myPerson = MyPerson("libin", 18)
    myPerson.mySay()

  }

}
