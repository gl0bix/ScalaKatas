package com.gl0bix.katas

object Tribonacci {
  @scala.annotation.tailrec
  def tribonacci(signature: Seq[Int], n: Int): Seq[Int] = {
    if (signature.length >= n) signature.take(n)
    else tribonacci(signature :+ signature.takeRight(3).sum, n)
  }
    
}
