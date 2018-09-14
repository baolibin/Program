package libin.program._02_scala.highOrder

import java.awt.event.{ActionEvent, ActionListener}

/**
  * Copyright (c) 2018/09/14. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : Scala的高阶函数特性
  */
object HighOrder {
  def main(args: Array[String]): Unit = {

    // 作为值的函数
    import scala.math._
    val fun = ceil _
    Array(11, 12, 13, 14, 15).map(fun(_)).foreach(println)

    // 匿名函数
    Array(11.0, 12.0, 13.0, 14.0, 15.0).map((x: Double) => 3.14 * x).foreach(println)

    // 带函数参数的函数
    def mulBy(factor: Double) = (x: Double) => factor * x

    println(mulBy(3)(4))

    // 参数(类型)推断
    val funOp: Double => Double = 3 * _
    println(funOp(4))

    // 闭包 . 可以在任何作用域内定义函数：包、类甚至是另一个函数或方法。函数可以在变量不处于作用域内被调用.
    def mulAdd(factor: Double) = (x: Double) => factor + x

    val triple = mulAdd(3)
    val half = triple(4)
    println(half)

    // SAM转换
    implicit def makeAction(action: ActionEvent => Unit): ActionListener =
      new ActionListener {
        override def actionPerformed(e: ActionEvent): Unit = action(e)
      }

    // 柯里化 . 将原来接受两个参数的函数变成新的接受一个参数的函数的过程. 新函数返回一个以原有第二个参数作为参数的函数 .
    def mul(x: Int, y: Int) = x * y

    def mulOneAtATime(x: Int) = (y: Int) => x * y

    println(mul(3, 4))
    println(mulOneAtATime(3)(4))

  }
}
