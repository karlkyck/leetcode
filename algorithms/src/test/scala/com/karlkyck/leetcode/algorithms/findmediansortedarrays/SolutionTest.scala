package com.karlkyck.leetcode.algorithms.findmediansortedarrays

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by karlkyck on 23/07/17.
  */
class SolutionTest extends FlatSpec with Matchers {

  "Solution" should "return the correct answer for [1, 3] [2]" in {
    val nums1 = Array(1, 3)
    val nums2 = Array(2)

    val median = Solution.findMedianSortedArrays(nums1, nums2)

    assert(median == 2)
  }

  it should "return the correct answer for [1, 2] [3, 4]" in {
    val nums1 = Array(1, 2)
    val nums2 = Array(3, 4)

    val median = Solution.findMedianSortedArrays(nums1, nums2)

    assert(median == 2.5)
  }
}
