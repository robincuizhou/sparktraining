package com.sparktraining.demo.streaming

import java.io._
import java.net.ServerSocket

/**
 * Created by robin on 16/4/7.
   模拟随机发送A-G 7个字母中的一个，时间间隔可指定
 arg1: 8901
 arg2: 2
 */


object LoggerSimulation {

  def generateContent(index: Int): String = {
    import scala.collection.mutable.ListBuffer
    val charList = ListBuffer[Char]()
    for (i <- 65 to 90) {
      charList += i.toChar
    }
    val charArray = charList.toArray
    charArray(index).toString
  }

  def index = {
    import java.util.Random
    val rdm = new Random
    //rdm.nextInt(26)
    rdm.nextInt(7)
  }

  def main(args: Array[String]) {
    if (args.length != 2) {
      System.err.println("Usage: <port> <millisecond>")
      System.exit(1)
    }

    val listener = new ServerSocket(args(0).toInt)
    while (true) {
      val socket = listener.accept()
      new Thread() {
        override def run = {
          println("Got client connected from: " + socket.getInetAddress)
          val out = new PrintWriter(socket.getOutputStream(), true)
          while (true) {
            Thread.sleep(args(1).toLong)
            val content = generateContent(index)
            println(content)
            out.write(content + '\n')
            out.flush()
          }

          socket.close()
        }
      }.start()
    }


  }

}
