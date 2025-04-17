package com.gl0bix.katas

object CamelCase extends App {

  def toCamelCase(str: String): String = {
    if (str.isEmpty) str
    else {
      val split = str.split("_|-")
      val cameledHead = split.head.head + split.head.tail.toLowerCase
      val cameledTail = split.tail.map(x => x.substring(0, 1).toUpperCase ++ x.tail.toLowerCase)

      cameledHead ++ cameledTail.reduce(_ + _)
    }
  }
}
