// Databricks notebook source exported at Mon, 26 Sep 2016 17:03:11 UTC
val rdd = sc.parallelize((1 to 10).toList)

// COMMAND ----------

val rdd2 = rdd.map(_ + 2)
rdd2.reduce((a,b) => a + b)

// COMMAND ----------

println("hello there!")

// COMMAND ----------

