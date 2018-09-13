package libin.program._02_scala.typeParam

/**
  * Copyright (c) 2018/9/11. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 
  */
object TypeParam {
  def main(args: Array[String]): Unit = {
    val p = new pair("hadoop", "spark")
    println(p.getSmall)
  }
}

// 上界
class pair[T <: Comparable[T]](val first: T, val second: T) {
  def getSmall: T = if (first.compareTo(second) < 0) first else second
}
