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
    val p3 = new pair2("hadoop", "spark")
    println(p3.smaller)
    val p4 = new pair3("hadoop", "spark")
    println(p4.smaller)
    val p5 = new pair4("hadoop", "spark")
    println(p5.makePair().mkString("|"))

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

/**
  * 视图界定
  * pair[T <% Comparable[T]] 意味着T可以被隐士转换成Comparable[T]
  */
// class pair2[T](val first: T, val second: T)(implicit x: T => Ordered[T]) {
class pair2[T <% Ordered[T]](val first: T, val second: T) {
  def smaller: T = if (first.compareTo(second) < 0) first else second
}

/**
  * 上下文界定
  * 视图界定T<%V要求必须存在一个T到V的隐士转换。上下文界定T:M ,其中M是另一个泛型类，要求必须存在着一个类型为M[T]的隐式值.
  */
class pair3[T: Ordering](val first: T, val second: T) {
  def smaller(implicit ord: Ordering[T]) = if (ord.compare(first, second) < 0) first else second
}

/**
  * Manifest上下文界定
  * 要实例化一个泛型Array[T],需要一个Manifest[T]对象
  */
class pair4[T: Manifest](val first: T, val second: T) {
  def makePair(): Array[T] = {
    val arr = new Array[T](2)
    arr(0) = first
    arr(1) = second
    arr
  }
}

/**
  * 多重界定
  *1.类型变量可以同时拥有上界和下届：T >: Lower <: Upper
  *2.不能同时有多个上界和下届，但是一个类型可以实现多个特质：T <: Comparable[T] with Serializable with Cloneable
  *3.可以有多个视图界定：T <% Comparable[t] <% String
  *4.可以有个多个上下文界定：T : Ordering : Manifest
  */

/**
  * 类型约束
  * T =:= U   T是否等于U
  * T <:< U   T是否为U子类型
  * T <%< U   T是否能被隐式转换为U
  */
class pair5[T](val first: T, val second: T)(implicit ev: T =:= Comparable[T])

class pair6[T](val first: T, val second: T)(implicit ev: T <:< Comparable[T])
