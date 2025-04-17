package com.gl0bix.katas

object TenMinWalk {
  def isValidWalk(walk: Seq[Char]): Boolean = {
    if (walk.count(_.equals('n')) != walk.count(_.equals('s'))) false
    else if (walk.count(_.equals('w')) != walk.count(_.equals('e'))) false
    else if (walk.length != 10) false
    else true
  }
}
