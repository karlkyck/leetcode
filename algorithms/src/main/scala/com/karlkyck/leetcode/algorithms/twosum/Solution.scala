package com.karlkyck.leetcode.algorithms.twosum

/**
  * 1. Two Sum
  *
  * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  *
  * You may assume that each input would have exactly one solution, and you may not use the same element twice.
  *
  * Example:
  * Given nums = [2, 7, 11, 15], target = 9,
  *
  * Because nums[0] + nums[1] = 2 + 7 = 9,
  * return [0, 1].
  *
  */
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    val numsMap = nums
      .zipWithIndex
      .map {
        case (num, index) => num -> index
      }
      .toMap

    nums
      .zipWithIndex
      .foldLeft(Array[Int]()) {
        case (accum, (num, index)) =>
          numsMap
            .filter {
              case (_, numsMapIndex) => numsMapIndex > index
            }
            .get(target - num)
            .map(accum.+:(_).+:(index))
            .getOrElse(accum)
      }
  }
}
