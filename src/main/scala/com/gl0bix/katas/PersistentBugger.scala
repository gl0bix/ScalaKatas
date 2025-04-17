package com.gl0bix.katas

object PersistentBugger {
  /**
   * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
   * which is the number of times you must multiply the digits in num until you reach a single digit. 
   * */  
  
  def persistence(n: Int, c: Int = 0): Int = 
    if (n.toString.length <= 1) c
    else persistence(n.toString.map(_.asDigit).product, c + 1)
}
