package com.gl0bix.katas

import java.util.InputMismatchException

object PhoneNumber {

  /**
   * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
   * Example
   *
   * Kata.createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) # => returns "(123) 456-7890"
   *
   * The returned format must be correct in order to complete this challenge.
   *
   * Don't forget the space after the closing parentheses!
   *
   */
  def createPhoneNumber(numbers: Seq[Int]): String = {
    if (numbers.length != 10) ""
    else "(%d%d%d) %d%d%d-%d%d%d%d".format(numbers* )
  }
  /*
  def createPhoneNumber(numbers: Seq[Int]): String = {
    if (numbers.length != 10) throw new InputMismatchException()
    else s"(${numbers(0)}${numbers(1)}${numbers(2)}) ${numbers(3)}${numbers(4)}${numbers(5)}-${numbers(6)}${numbers(7)}${numbers(8)}${numbers(9)}" 
  }
  */

  def main(args: Array[String]): Unit = {
      println(createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))
  }
}
