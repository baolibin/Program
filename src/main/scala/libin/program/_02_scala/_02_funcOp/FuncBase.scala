package libin.program._02_scala._02_funcOp

/**
  * Copyright (c) 2018/9/11. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 函数、数组、映射、元组、列表
  */
object FuncBase {
  def main(args: Array[String]): Unit = {

    def apply: FuncBase = new FuncBase()

    val funcOp: FuncBase = apply

    // Array operation
    val array = funcOp.getArr
    array.sortBy(x => x).reverse.mkString(",").foreach(print)

    // Tuple operation
    println("\n" + funcOp.getTuple._1 + "\t" + funcOp.getTuple._2)

    // List operation
    funcOp.getList.mkString("、").foreach { x => print(x) }
    println()

    // Map operation
    funcOp.getMap.get("hadoop").foreach(println)

  }
}

class FuncBase {

  def getArr: Array[Int] = {
    Array(3, 1, 4, 1, 5, 9, 2, 6)
  }

  def getTuple: (String, Int) = {
    ("hadoop", 12)
  }

  def getList: List[String] = {
    List("hadoop", "hive", "hbase", "spark")
  }

  def getMap: Map[String, Int] = {
    Map("hadoop" -> 12)
  }

}

