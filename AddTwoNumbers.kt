/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var result: ListNode? = null

        if(l1 == null && l2 == null)
        {
            return result
        }
        else if(l1 == null && l2 != null)
        {
            return l2
        }
        else if(l1 != null && l2 == null)
        {
            return l1
        }
        else if(l1 != null && l2 != null)
        {
            var sum = (l1.`val` + l2.`val`) % 10
            var incre = (l1.`val` + l2.`val`) / 10
            result = ListNode(sum)
            if(incre > 0)
            {
                result.next = addTwoNumbers(addTwoNumbers(ListNode(incre), l1.next), l2.next)
                return result
            }
            else
            {
                result.next = addTwoNumbers(l1.next, l2.next)
                return result
            }
        }

        return result
    }
}
