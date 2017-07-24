package com.karlkyck.leetcode.algorithms.longestpalindrome

import org.scalatest.{FlatSpec, Matchers}

class SolutionTest extends FlatSpec with Matchers {

  "Solution" should "return the longest palindrome for babad" in {

    val answer = Solution.longestPalindrome("babad")

    answer shouldBe "aba"
  }

  "Solution" should "return the longest palindrome for cbbd" in {

    val answer = Solution.longestPalindrome("cbbd")

    answer shouldBe "bb"
  }

  "Solution" should "return the longest palindrome for abcba" in {

    val answer = Solution.longestPalindrome("abcba")

    answer shouldBe "abcba"
  }

  "Solution" should "return the longest palindrome for bananas" in {

    val answer = Solution.longestPalindrome("bananas")

    answer shouldBe "anana"
  }
}
