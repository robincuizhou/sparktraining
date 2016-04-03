package com.scalatraining.three

/**
 * Created by robin on 16/4/2.
 */
object AdvanceFunction {

  def add(x:Int, y:Int) = x+y

  def main(args:Array[String]): Unit ={


    println("test")
    add(1,2)

    // 值函数
    // var 也可以, 值函数, 一定要加 _ , 不然会以偏函数对待
    // 偏函数是能让函数只求一部分参数求出来 也能做出来
    val  _add = add _
    _add(1,2)


//    匿名函数
//    (x : Int) => x + 2
    //如何调用
    //def,val 声明匿名函数都可以
    val fun = (x : Int) => x + 2
    println( fun(8) )
    // 扩展
    val l  = List(1,2,3,4)
    val l1 = l.map((x:Int) => x*2)
    //当前面只有1个参数的时候 _可以表示List的每一个元素
    val l2 = l.map(_ * 2)
    for(i <- l.map(fun)) println( i )

    println(">>>>>>>>> 函数作为参数 1")
//   函数作为参数
    def func(f:(Int,Int) => Int) : Int = f(1,2)
    println( func((x:Int, y:Int) => x + y) )
    println( func((x:Int, y:Int) => x * y) )

    println(">>>>>>>>> 函数作为参数 2")
    def mulBy(factor : Double) = (x : Double) => factor * x
    val tmp = mulBy(2)
    println(tmp(10))
    // 20.0
  }

}
