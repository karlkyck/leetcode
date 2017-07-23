package com.karlkyck.leetcode.algorithms.combinationsum

/**
  * Created by karlkyck on 23/07/17.
  */
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    val numsMap = nums.zipWithIndex.map { case (num, index) => num -> index }.toMap

    nums.zipWithIndex.foldLeft(Array[Int]()) {
      case (accum, (num, index)) =>
        numsMap
          .get(target - num)
          .map {
            numsMapIndex =>
              if (numsMapIndex > index)
                accum.+:(numsMapIndex).+:(index)
              else
                accum
          }
          .getOrElse(accum)
    }
  }
}
