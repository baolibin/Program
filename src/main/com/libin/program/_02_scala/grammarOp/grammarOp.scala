package com.libin.program._02_scala.grammarOp

import scala.util.parsing.combinator._
import scala.util.matching.Regex
/**
  * Copyright (c) 2018/09/13. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 文法定义中二选一、拼接、选项和重复在Scala组合子解析器中对应 竖线、波浪线、opt和rep
  */

/*object grammarOp extends RegexParsers{
  def main(args: Array[String]): Unit = {

  }
}*/
/*
object Calculator extends RegexParsers {
  def number: Parser[Double] = """\d+(\.\d*)?""".r ^^ { _.toDouble }
  def factor: Parser[Double] = number | "(" ~> expr <~ ")"
  def term  : Parser[Double] = factor ~ rep( "*" ~ factor | "/" ~ factor) ^^ {
    case number ~ list => (number /: list) {
      case (x, "*" ~ y) => x * y
      case (x, "/" ~ y) => x / y
    }
  }
  def expr  : Parser[Double] = term ~ rep("+" ~ log(term)("Plus term") | "-" ~ log(term)("Minus term")) ^^ {
    case number ~ list => list.foldLeft(number) { // same as before, using alternate name for /:
      case (x, "+" ~ y) => x + y
      case (x, "-" ~ y) => x - y
    }
  }

  def apply(input: String): Double = parseAll(expr, input) match {
    case Success(result, _) => result
    case failure : NoSuccess => scala.sys.error(failure.msg)
  }
}*/
