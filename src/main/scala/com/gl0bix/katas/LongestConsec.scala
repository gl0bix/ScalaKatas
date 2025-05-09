package com.gl0bix.katas


/**
 * You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string 
 * consisting of k consecutive strings taken in the array.
 * 
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return ""
 */
object LongestConsec extends App {
  def longestConsec(strarr: Array[String], k: Int): String = {
    val l = strarr.length
    if (l == 0 || k > l || k<= 0 ) ""
    else strarr.map(x =>
      strarr.slice(strarr.indexOf(x), strarr.indexOf(x) + k).reduce(_ + _)
    ).maxBy(_.length)
  }
}
