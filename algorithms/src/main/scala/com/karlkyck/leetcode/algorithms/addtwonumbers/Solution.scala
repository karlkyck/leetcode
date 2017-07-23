package com.karlkyck.leetcode.algorithms.addtwonumbers

/**
  * 2. Add Two Numbers
  *
  * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
  *
  * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
  *
  * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  * Output: 7 -> 0 -> 8
  *
  */
object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {

    val zero = new ListNode(0)

    def rec(recL1: ListNode, recL2: ListNode, carry: Int): ListNode = {
      val maybeL1 = Option(recL1)
      val maybeL2 = Option(recL2)

      if (maybeL1.isDefined || maybeL2.isDefined) {
        val actualL1 = maybeL1.getOrElse(zero)
        val actualL2 = maybeL2.getOrElse(zero)
        val sum = actualL1.x + actualL2.x + carry
        val recCarry = if (sum >= 10) 1 else 0
        val finalSum = if (sum >= 10) sum - 10 else sum

        val listNode = new ListNode(finalSum)
        listNode.next = rec(actualL1.next, actualL2.next, recCarry)
        listNode

      } else if (carry > 0)
        ListNode(carry)
      else
        null
    }

    rec(l1, l2, 0)
  }
}

object ListNode {

  def apply(x: Int): ListNode = {
    new ListNode(x)
  }

  def apply(x: Int, next: ListNode): ListNode = {
    val listNode = new ListNode(x)
    listNode.next = next
    listNode
  }
}

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x

  def withNext(next: ListNode): ListNode = {
    this.next = next
    this
  }
}
