package com.libin.program._02_scala.annotationOp

import com.sun.istack.internal.NotNull

import scala.annotation.{Annotation, ClassfileAnnotation, StaticAnnotation, varargs}
import scala.annotation.meta.{getter, setter}
import scala.collection.mutable

/**
  * Copyright (c) 2018/09/13. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 可以为类、方法、字段、局部变量和参数添加注解
  */
object annotationOp {
  def main(args: Array[String]): Unit = {
    def apply: annotationOp = new annotationOp()

    val anoOp = apply
    anoOp.process("a", "b", "c")
  }
}

/**
  * 注解类可以扩展 ClassfileAnnotation、StaticAnnotation
  * ClassfileAnnotation在编译单元中可见，放置Scala特有的元数据到类文件中
  * StaticAnnotation在类文件中生成Java注解元数据
  */
class annotationOp extends ClassfileAnnotation {
  @volatile var update = false // 可以被多个线程同时更新
  @transient val map = new mutable.HashMap[String, Long]() // 将字段标记为瞬态的，不会被序列化

  def printTest(@NotNull info: String): Unit = {
    println("printTest")
  }

  @varargs def process(args: String*): Unit = {
    println(args.mkString("、"))
  }

}
