// Databricks notebook source exported at Mon, 26 Sep 2016 17:15:17 UTC
val rdd = sc.parallelize((1 to 10).toList)

// COMMAND ----------

val rdd2 = rdd.map(_ + 2)
rdd2.reduce((a,b) => a + b)

// COMMAND ----------

println("hello there!")

// COMMAND ----------

val rdd3 = rdd2.map(_ * 3)

// COMMAND ----------

println(rdd3.reduce((a,b) => a + b))

// COMMAND ----------

val rdd4 = rdd3.map(_ - 4)

// COMMAND ----------

