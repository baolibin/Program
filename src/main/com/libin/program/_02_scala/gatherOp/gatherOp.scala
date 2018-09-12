package main.com.libin.program._02_scala.gatherOp

import scala.collection.mutable

/**
  * Copyright (c) 2018/9/12. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose :  集合三大类：序列seq、集set、映射map
  */
object gatherOp {
  def main(args: Array[String]): Unit = {

    // seq
    val seq = Seq("h", "a", "d", "o", "o", "p")
    println(seq.mkString("、"))

    val list = List("h", "a", "d", "o", "o", "p")
    println(list.mkString("、"))

    // set
    val set = Set[String]("h", "a", "d", "o", "o", "p")
    println(set.mkString("、"))

    val sortedSet = mutable.SortedSet[String]("h", "a", "d", "o", "o", "p")
    println(sortedSet.mkString("、"))

    val synchronizedSet = new mutable.HashSet[String] with mutable.SynchronizedSet[String]
    synchronizedSet += "h"
    synchronizedSet += "a"
    synchronizedSet += "d"
    println(synchronizedSet.mkString("、"))

    // map
    val map = Map("c" -> 3, "b" -> 2)
    println(map.mkString("、"))

    val sortedMap = mutable.SortedMap("c" -> 3, "a" -> 1, "b" -> 2)
    println(sortedMap.mkString("、"))

    val synchronizedMap = new mutable.HashMap[String, Int] with mutable.SynchronizedMap[String, Int]
    synchronizedMap += "c" -> 3
    synchronizedMap += "a" -> 1
    synchronizedMap += "b" -> 2
    println(synchronizedMap.mkString("、"))
  }
}
