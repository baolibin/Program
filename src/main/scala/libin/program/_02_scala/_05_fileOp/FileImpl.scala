package libin.program._02_scala._05_fileOp

/**
  * Copyright (c) 2018/9/10. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 
  */
object FileImpl {
  def main(args: Array[String]): Unit = {
    val path = this.getClass.getClassLoader.getResource("passwd.txt").getPath
    val set = FileBase.readFile(path)
    for (x <- set)
      println(x)
  }
}
