package com.karlkyck.leetcode.algorithms.lengthoflongestsubstring

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by karlkyck on 23/07/17.
  */
class SolutionTest extends FlatSpec with Matchers {

  "Solution" should "return the correct answer for \"abcabcbb\"" in {

    val answer = Solution.lengthOfLongestSubstring("abcabcbb")

    assert(answer == 3)
  }

  it should "return the correct answer for \"bbbbb\"" in {

    val answer = Solution.lengthOfLongestSubstring("bbbbb")

    assert(answer == 1)
  }

  it should "return the correct answer for \"pwwkew\"" in {

    val answer = Solution.lengthOfLongestSubstring("pwwkew")

    assert(answer == 3)
  }

}
