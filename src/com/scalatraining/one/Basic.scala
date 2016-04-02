package com.scalatraining.one

object Basic {

  def add(x : Int, y : Int) : Int = {
    (x*2)+y
  }

  def add(){
    println("say hello")
  }

  def loadConf(conf:String = "default"){
    println(conf)
  }

  def sum(elems : Int*){
    //    println()
  }

  def main(args:Array[String]){

    //add()
    //loadConf();
    //parameter order
    println(add(y=1,x=2))


    //sum(1,2,3,4)

    //可变数组
    val a = scala.collection.mutable.ArrayBuffer[Int]()
    //
    //    a+=1
    //    a+=5
    //    数组操作
    //    a+=(3,4,5)
    //    a++=Array(1,2,6)
    // insert 第一个参数是 插入位置
    a.insert(0,1,2,3)


    //    遍历数组
    //    for(i <- 0 until a.length)println(a(i))
    // 更多时候直接取出
    for(elem <-a)println(elem + ",")
    // Map 可变不可变
    // nochangeable
    val age = Map("mary"-> 24,"patric" -> 40)
    println(age("mary"))
    // changeable
    val range = scala.collection.mutable.Map[String,Int]("AA" -> 40, "ii" -> 99 )
    //Exception in thread "main" java.util.NoSuchElementException: key not found: a
    //println(range("a"))
    //println(range.get("a"))
    //println(range.getOrElse("a","not exists"))

    // 可变Map 插入
    //    range("AAB") = 90
    //    println( range("AA") + ", " + range("AAB"))
    //    println(range)
    // += 是Map的操作方法 不是赋值符号
    //    range += ("UU" -> 55, "PP" -> 91)
    //    range -= ("UU","op")
    //    println(range)

    /* 遍历Map */
    for((k,v) <- range){
      println("Name:" + k + ", Age:" + v);
    }

    /*只想知道k 不想知道v*/
    for((k,_) <- range){
      println("Name:" + k + ", Age:");
    }

    /*也可以单独取出key 集合 和  value 集合, 不过还是上面这个方法自然*/
    //    range.keySet
    //    range.values
    //    for(i<- range.keySet)println(i)
    //    for(i<- range.values)println(i)

    //元组 元括号里包含一组值

  }



}