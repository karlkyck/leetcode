package com.karlkyck.leetcode.algorithms.lengthoflongestsubstring

import scala.annotation.tailrec

/**
  * 3. Longest Substring Without Repeating Characters
  *
  * Given a string, find the length of the longest substring without repeating characters.
  *
  * Examples:
  *
  * Given "abcabcbb", the answer is "abc", which the length is 3.
  *
  * Given "bbbbb", the answer is "b", with the length of 1.
  *
  * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
  *
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
