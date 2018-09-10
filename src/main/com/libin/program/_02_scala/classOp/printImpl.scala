package main.com.libin.program._02_scala.classOp

import scala.reflect.ClassTag

/**
  * Copyright (c) 2018/9/10. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 
  */
object printImpl extends printBase with SportFac with MyHome {

  case class Stu(name: String, age: Int)

  def main(args: Array[String]): Unit = {
    val stu: Stu = Stu("libin", 18)

    printInfo(stu)
    mySport("basketball")
    myHome("china")

  }
}

trait SportFac {
  def mySport[T: ClassTag](action: T): Unit = {
    println("my favorite sport is " + action)
  }
}

trait MyHome {
  def myHome[T: ClassTag](home: T): Unit = {
    println("my home is " + home)
  }
}

