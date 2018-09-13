package libin.program._02_scala.fileOp

import java.io.{File, FileWriter}

import scala.collection.mutable
import scala.io.Source

/**
  * Copyright (c) 2018/9/10. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 
  */
object FileBase {


  /**
    * 读取制定路径的文件
    *
    * @param path 文件路径
    * @return
    */
  def readFile(path: String): mutable.HashSet[String] = {
    val file = Source.fromFile(path)

    val set = new mutable.HashSet[String]()
    for (line <- file.getLines()) {
      set.add(line.trim)
    }
    set
  }


  /**
    * 往文件中追加写入内容
    *
    * @param path 文件路径
    * @param info 写入信息
    */
  def writeFile(path: String, info: String): Unit = {
    val writer = new FileWriter(new File(path), true)
    writer.write(info + "\n")
    writer.close()
  }

}
