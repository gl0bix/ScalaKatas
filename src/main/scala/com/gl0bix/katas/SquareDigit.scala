package com.gl0bix.katas

object SquareDigit extends App {
  def squareDigits(n: Int): Int =
    n.toString.map(x => x.asDigit * x.asDigit).toList.map(_.toString).reduce(_ + _).toInt
    
    //better: n.toString.map(_.asDigit).map(d => d*d).mkString.toInt
}
