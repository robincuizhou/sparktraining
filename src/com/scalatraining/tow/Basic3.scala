package com.scalatraining.tow

/**
 * Created by robin on 16/4/2.
 */
class Basic3 {

}

abstract class Person1{
  def speak
  val name:String
  var age:Int
}

class Student1 extends Person1{

  def speak: Unit ={
    println("hello school")
  }

  val name = "Tom"
  var age = 40

}

trait Logger{

  def log(msg:String): Unit ={
    println("log:" + msg)
  }

}

// 第一个混入的特质， 不可能没有extends 直接with
class Test extends Logger{
  def test(msg : String): Unit ={
     log("xxx")
  }

}

object Basic3 extends App{

  val s = new Student1
  s.speak

  println(s.name + " : " + s.age)

  val t = new Test
  t.test("anything")



}

