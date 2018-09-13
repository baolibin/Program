package libin.program._02_scala.matchOp

/**
  * Copyright (c) 2018/09/12. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose :
  */
object matchOp {
  def main(args: Array[String]): Unit = {
    val mary = Mary("mary", "Chinese style")
    val jeanne = Mary("jeanne", "Chinese paintings")
    getMatch(mary)
    getMatch(jeanne)
  }

  def getMatch(p: Persion): Unit =
    p match {
      case Bob(name,sport) => println(s"$name favorite sport is $sport")
      case Mary(name,music) => println(s"$name favorite music is $music")
      case x: Jeanne => println(s"${x.name} favorite draw is ${x.draw}")
      case _: Throwable => println("no match")
    }
}

sealed trait Persion

case class Bob(name: String, sport: String) extends Persion

case class Mary(name: String, music: String) extends Persion

case class Jeanne(name: String, draw: String) extends Persion
