package libin.utils

import scala.io.Source
import scala.util.Try

/**
  * Copyright (c) 2018/09/20. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose :
  */
object FileUtils {

  /**
    * 读取配置文件
    *
    * @param fileName 文件名
    * @return 返回所有记录的集合
0    */
  def readResourceFile(fileName: String): Array[String] = {
    val inputStream = this.getClass.getClassLoader.getResourceAsStream(fileName)
    Source.fromInputStream(inputStream).getLines().toArray
  }

  /**
    * 读取配置文件
    *
    * @param fileName 文件名
    * @param delimit  分隔符
    * @return 返回所有记录的集合
    */
  def readResourceFile(fileName: String, delimit: String): Map[String, String] = {
    val inputStream = this.getClass.getClassLoader.getResourceAsStream(fileName)
    Source.fromInputStream(inputStream).getLines()
      .map {
        line =>
          val sp = line.split(delimit)
          Try((sp(0), sp(1))).getOrElse((sp(0), null))
      }.toMap
  }

  def main(args: Array[String]): Unit = {
    FileUtils.readResourceFile("passwd.txt").foreach(println)
  }
}
