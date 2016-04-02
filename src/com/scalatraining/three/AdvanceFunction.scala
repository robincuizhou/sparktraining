package com.scalatraining.three

/**
 * Created by robin on 16/4/2.
 */
object AdvanceFunction {

  def add(x:Int, y:Int) = x+y

  def main(args:Array[String]): Unit ={


    println("test")
    add(1,2)

    // var 也可以, 值函数, 一定要加 _ , 不然会以偏函数对待
    // 偏函数是能让函数只求一部分参数求出来 也能做出来
    val  _add = add _
    _add(1,2)

  }

}
