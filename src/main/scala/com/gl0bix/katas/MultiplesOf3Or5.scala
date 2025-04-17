package com.gl0bix.katas

object MultiplesOf3Or5 {
  
  def solution(number: Int): Long = Range(1, number).filter(x => x % 3 == 0 || x % 5 == 0 ).toSet.sum
}
