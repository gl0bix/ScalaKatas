package com.gl0bix.katas

import scala.annotation.tailrec

object MaxSubArraySum {
  def sequence(arr: Array[Int]): Int = {
    arr.scanLeft(0)(_ + _ max 0).max
  }

  def main(args: Array[String]): Unit = {
    println(sequence(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
  }
}
