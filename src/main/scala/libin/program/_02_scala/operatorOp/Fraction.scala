package libin.program._02_scala.operatorOp

/**
  * Copyright (c) 2018/09/13. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose :提取器
  */
class Fraction(one: Int, two: Int) {

  def addOp(): Int = {
    one + two
  }

  def getOne: Int = one

  def getTwo: Int = two

  def *(other: Fraction): Int = this.addOp() * other.addOp()
}

object Fraction {
  def apply(one: Int, two: Int): Fraction = new Fraction(one, two)

  def unapply(arg: Fraction): Option[(Int, Int)] = {
    Some(arg.getOne, arg.getTwo)
  }

  def main(args: Array[String]): Unit = {
    val value: Int = Fraction(12, 13) * Fraction(14, 15)
    println(value)

    val Fraction(one, two) = Fraction(12, 13)
    println(one + " and " + two)
  }
}