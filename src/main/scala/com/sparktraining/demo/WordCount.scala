package com.sparktraining.demo

/**
 * Created by robin on 16/4/7.
 */


import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

/*
monitor cuizhou:8080
        cuizhou:8088
 */

object WordCount {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      //      .setMaster("spark://cuizhou:8888")
      .setMaster("local[4]")
      .setAppName("WordCount")
    //      .setJars("/Users/robin/IdeaProjects/SparkApp/out/artifacts/First/First.jar")
    //

    val sc = new SparkContext(conf)
    sc.addJar("/Users/robin/IdeaProjects/SparkApp/out/artifacts/SparkApp_jar/SparkApp.jar")

    val line = sc.textFile("hdfs://cuizhou:9000/user/root/wifi.log")
    //
    line.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_ + _).collect().foreach(println)
    line.cache()
    //
    sc.stop()

    println(111)

  }

}

