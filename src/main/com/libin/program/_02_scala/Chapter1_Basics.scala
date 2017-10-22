package libin.program._02_scala

/**
  * Scala一些基础的认知
  */
object Chapter1_Basics {

  case class hello(name: String, age: Int, sex: String)
  implicit def toIntByStr(str: String): Int = Integer.parseInt(str)
  implicit def toIntByStr(str: Long): Int = str.toInt

  def main(args: Array[String]): Unit = {
    //1、case class
    val my: hello = hello("baozi", 18, "man")
    println(my.name + "、" + my.age + "、" + my.sex)
    //2、yield
    val myList: List[Int] = (for (i <- 1 until 10) yield i).toList
    println(myList)
    //3、implicit
    def addTwoInt(a: Int, b: Int) = a * b
    val impInt: Int = "123"
    println(impInt)
    println(addTwoInt("132", 10L))
    //4、
  }
}

