package com.gl0bix.katas

object TwoToOne {
  def longest(s1: String, s2: String): String = (s1 + s2).split("").toSet.reduce(_+_).sorted  
}
