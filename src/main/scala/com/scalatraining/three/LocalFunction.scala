package com.scalatraining.three

/**
 * Created by robin on 16/4/2.
 */

//嵌套函数
//好处就是方法内部的方法可以访问上层的 变量属性
object LocalFunction extends App{

  def add(x:Int,y:Int,z:Int): Int ={

    def add2(x:Int, y:Int): Int ={
      x + y
    }

    add2(add2(x,y),z)
  }

  println(add(1,2,3))

}
