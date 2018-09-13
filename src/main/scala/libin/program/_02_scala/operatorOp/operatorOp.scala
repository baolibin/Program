package libin.program._02_scala.operatorOp

/**
  * Copyright (c) 2018/09/13. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 操作符
  */
object operatorOp {
  def main(args: Array[String]): Unit = {
    // 标识符:由字母、数字、下划线构成。 变量、函数和类等名字统称为标识符。
    val _num123 = 123L
    println(_num123)

    // 中置操作符
    println((1 to 10).mkString("|"))
    println((1 until 10).mkString("|"))

    // 一元操作符
    println(~_num123)
    println(+_num123)
    println(-_num123)

  }
}
