package main.com.libin.program._02_scala.implicitDemo

/**
  * Copyright (c) 2018/9/9. xixi Inc. All Rights Reserved.
  * Authors: libin <2578858653@qq.com>
  * <p>
  * Purpose : 
  */
object ImplicitBase {

  case class MyPerson(name: String, age: Int)


  implicit class MyImplicit(person: MyPerson) {

    def mySay(): Unit = {
      println(s"My name is ${person.name} ,my age is ${person.age}")
    }
  }

}

