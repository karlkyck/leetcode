package com.karlkyck.leetcode.algorithms.twosum

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by karlkyck on 23/07/17.
  */
class SolutionTest extends FlatSpec with Matchers {

  "Solution" should "return the correct array of indices for nums = [2, 7, 11, 15], target = 9" in {
    val nums = Array(2, 7, 11, 15)
    val target = 9

    assert(Array(0, 1).sameElements(Solution.twoSum(nums, target)))
  }

  it should "return the correct array of indices for nums = [5, 8, 17, 10], target = 27" in {
    val nums = Array(5, 8, 17, 10)
    val target = 27

    assert(Array(2, 3).sameElements(Solution.twoSum(nums, target)))
  }

  it should "return the correct array of indices for nums = [5, 5, 17, 10], target = 10" in {
    val nums = Array(5, 5, 17, 10)
    val target = 10

    assert(Array(0, 1).sameElements(Solution.twoSum(nums, target)))
  }

}