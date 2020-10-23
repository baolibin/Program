package libin.program._02_scala._04_classOp

import libin.program._02_scala._04_classOp.printImpl.Stu

import scala.reflect.ClassTag

/**
  * Copyright (c) 2018/9/10. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 
  */
class printBase extends Base {

    def printInfo[T: ClassTag](t: T): Unit = {
        println(t)
        t match {
            case stu: Stu => println(stu.name)
            case _ => println("Null")
        }
    }

}

trait Base {
    def printInfo[T: ClassTag](t: T)
}

object printBase {
    def main(args: Array[String]): Unit = {
        def obj: printBase = new printBase()

        obj.printInfo("hello")
    }

}

