package com.karlkyck.leetcode.algorithms.findmediansortedarrays

import scala.annotation.tailrec

/**
  * 4. Median of Two Sorted Arrays
  *
  * There are two sorted arrays nums1 and nums2 of size m and n respectively.
  * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
  *
  * Example 1:
  * nums1 = [1, 3]
  * nums2 = [2]
  *
  * The median is 2.0
  * Example 2:
  * nums1 = [1, 2]
  * nums2 = [3, 4]
  *
  * The median is (2 + 3)/2 = 2.5
  */
object Solution {

  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {

    @tailrec
    def rec(a: Array[Int], b: Array[Int], accum: Array[Int]): Array[Int] = (a, b) match {
      case (Array(), Array()) => accum
      case (aArr, Array()) =>
        rec(aArr.tail, b, accum.+:(aArr.head))
      case (Array(), bArr) =>
        rec(a, bArr.tail, accum.+:(bArr.head))
      case (aArr, bArr) =>
        if (aArr.head > bArr.head)
          rec(aArr, bArr.tail, accum.+:(bArr.head))
        else
          rec(aArr.tail, bArr, accum.+:(aArr.head))
    }

    val mergeSortedArray = rec(nums1, nums2, Array())

    if (mergeSortedArray.length % 2 == 0) {
      val index = (mergeSortedArray.length / 2l).toInt
      (mergeSortedArray(index) + mergeSortedArray(index - 1)) / 2d
    } else {
      val index = Math.ceil(mergeSortedArray.length / 2).toInt
      mergeSortedArray(index)
    }
  }
}
