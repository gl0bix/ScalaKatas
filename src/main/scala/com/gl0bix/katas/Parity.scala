package com.gl0bix.katas

object Parity extends App {
  def findOutlier(integers: List[Int]): Int =
    integers.partition(x => x % 2 == 0) match {
      case (list1, list2) if list1.length == 1 => list1.last
      case (list1, list2) if list2.length == 1 => list2.last
    }


  println(List(2, 6, 8, 22, 3))

}