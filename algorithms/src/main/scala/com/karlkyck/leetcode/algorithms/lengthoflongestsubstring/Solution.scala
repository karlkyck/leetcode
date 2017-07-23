package com.karlkyck.leetcode.algorithms.lengthoflongestsubstring

import scala.annotation.tailrec

/**
  * Created by karlkyck on 23/07/17.
  */
object Solution {
  def lengthOfLongestSubstring(s: String): Int = {

    @tailrec
    def rec(accum: Set[Char], maxSize: Int, chars: Array[Char]): Int = chars match {
      case Array() => maxSize
      case _ =>
        val char = chars.head
        if (accum.contains(char))
          rec(Set(char), maxSize, chars.tail)
        else {
          val newAccum = accum.+(char)
          val newMaxSize = if (maxSize > newAccum.size) maxSize else newAccum.size
          rec(newAccum, newMaxSize, chars.tail)
        }
    }

    rec(Set(), 0, s.toCharArray)
  }
}
