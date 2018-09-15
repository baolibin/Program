package libin.program._02_scala.typeParam

/**
  * Copyright (c) 2018/9/11. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 
  */
object TypeParam {
  def main(args: Array[String]): Unit = {
    val p1 = new pair("hadoop", "spark")
    println(p1.getSmall)
    val p2 = new PairDown("hadoop", "spark")
    println(p2.replaceFirst("hive").toString)
  }
}

// 上界
class pair[T <: Comparable[T]](val first: T, val second: T) {
  def getSmall: T = if (first.compareTo(second) < 0) first else second
}

// 下界
class PairDown[T](val first: T, val second: T) {

  def replaceFirst[R >: T](newFirst: R) = new PairDown[R](newFirst, second)

  override def toString: String = this.first + "\t" + this.second
}
