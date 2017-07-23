package com.karlkyck.leetcode.algorithms.addtwonumbers

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by karlkyck on 23/07/17.
  */
class SolutionTest extends FlatSpec with Matchers {

  "Solution" should "return the correct answer for [2 4 3] + [5 6 4]" in {
    val number1 = ListNode(2, ListNode(4, ListNode(3, null)))
    val number2 = ListNode(5, ListNode(6, ListNode(4, null)))

    val answer = Solution.addTwoNumbers(number1, number2)

    assert(answer.x == 7)
    assert(answer.next.x == 0)
    assert(answer.next.next.x == 8)
    assert(answer.next.next.next == null)
  }

  it should "return the correct answer for [5] + [5]" in {
    val number1 = ListNode(5, null)
    val number2 = ListNode(5, null)

    val answer = Solution.addTwoNumbers(number1, number2)

    assert(answer.x == 0)
    assert(answer.next.x == 1)
    assert(answer.next.next == null)
  }

}
