package com.scalatraining.tow

/**
 * Created by robin on 16/4/2.
 */
class Basic2 {

}

//class Person{
//
//  var name : String = _
//  var age = 10
//
//}


// 1. 主构造器直接跟在类名之后, 主构造器的参数最后会编译成字段
// 2. 主构造器执行的时候，会执行类中所有的语句
// 3. 如果把val去掉, 会报 name 不是Person的成员的错
//    参数声明时不带 var val, 那么相当于 private[this], 外面是访问不到的只有内部方法访问, 编译器直接报错 (p.name直接报错)
class Person(var name : String, val age : Int){

  println("this is the primary constructor!")

  var gender : String = _
  val school = "good school"

  // 附构造器
  // 在任何一个附属构造器当中 第一行一定要调用现在已经存在的子构造器, 或者附属构造器
  def this(name : String, age : Int, gender : String){
    this(name,age)
    this.gender = gender
    println("this is the subclass one constructor!")
  }

}

//继承
//
class Student(name : String, age : Int,  gender : String, major : String) extends Person(name, age, gender){
  println("this is the subclass two of Person, major is: " + major)

  // 重写父类方法一定要加overwrite, 编译器会报错如果无override
  // override 关键字不只是修饰方法
  override def toString  = "to string method >>>"

  override val school = "good school"

}

object Basic2{

  def main(args:Array[String]): Unit ={

//    var p = new Person
//    p.name = "Michael"
//    p.age  = 20
//    println("name: " + p.name + ", age: " + p.age )

//  val p = new Person("Jacky", 20)
//  println("name: " + p.name + ", age: " + p.age )

    val s = new Student("Mary", 24, "w", "Biology")
//    result:
//    this is the primary constructor!
//    this is the subclass one constructor!
//    this is the subclass two of Person, major is: Biology
//    确保初始化这个Student 可以初始化对象相关的属性

    println(s.toString)

  }

}
