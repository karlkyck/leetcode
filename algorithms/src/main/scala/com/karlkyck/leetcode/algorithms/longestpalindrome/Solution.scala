package com.karlkyck.leetcode.algorithms.longestpalindrome

import scala.annotation.tailrec

/**
  * 5. Longest Palindromic Substring
  *
  * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
  *
  * Example:
  *
  * Input: "babad"
  *
  * Output: "bab"
  *
  * Note: "aba" is also a valid answer.
  * Example:
  *
  * Input: "cbbd"
  *
  * Output: "bb"
  *
  */
object Solution {

  case class Range(left: Int, right: Int) {
    def max(other: Range): Range =
      if (this.right - this.left > other.right - other.left) this else other
  }

  def longestPalindrome(s: String): String = {

    @tailrec
    def explore(l: Int, r: Int): Range = {
      if (l < 0 || r >= s.length || !s.charAt(l).equals(s.charAt(r))) {
        Range(l + 1, r - 1)
      } else {
        explore(l - 1, r + 1)
      }
    }

    @tailrec
    def rec(index: Int, range: Range): Range = {
      if (index > s.length) {
        range
      } else {
        val oneRange = explore(index, index)
        val twoRange = explore(index, index + 1)
        rec(index + 1, range.max(oneRange.max(twoRange)))
      }
    }

    val range = rec(0, Range(0, 0))

    s.substring(range.left, range.right + 1)
  }
}
